// Allows specifying engine by class name
// e.g. -e org.openapitools.examples.templating.PebbleTemplateAdapter
@file:JvmName("PebbleTemplateAdapter")
package org.openapitools.examples.templating

import com.mitchellbosecke.pebble.PebbleEngine
import com.mitchellbosecke.pebble.loader.ClasspathLoader
import com.mitchellbosecke.pebble.loader.DelegatingLoader
import com.mitchellbosecke.pebble.loader.FileLoader
import org.openapitools.codegen.api.AbstractTemplatingEngineAdapter
import org.openapitools.codegen.api.TemplatingExecutor
import java.io.StringWriter

// imports
class PebbleTemplateAdapter : AbstractTemplatingEngineAdapter() {
    // initialize the template compilation engine
    private val engine: PebbleEngine = PebbleEngine.Builder()
        .cacheActive(false)
        .loader(DelegatingLoader(listOf(FileLoader(), ClasspathLoader())))
        .build()
    // allows targeting engine by id/name: -e pebble
    override fun getIdentifier(): String = "pebble"
    override fun compileTemplate(
            executor: TemplatingExecutor,
        bundle: MutableMap<String, Any>?,
        templateFile: String?
    ): String {
        println("############ other message")
        // This will convert, for example, model.mustache to model.pebble
        val modifiedTemplate = this.getModifiedFileLocation(templateFile).first()
        // Uses generator built-in template resolution strategy to find the full template file
        val filePath = executor.getFullTemplatePath(modifiedTemplate)
        val writer = StringWriter()
        // Conditionally writes out the template if found.
        if (filePath != null) {
            engine.getTemplate(filePath.toAbsolutePath().toString())?.evaluate(writer, bundle)
        }
        return writer.toString()
    }
    override fun getFileExtensions(): Array<String> = arrayOf("pebble")
}