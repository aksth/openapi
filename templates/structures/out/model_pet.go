/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * API version: 1.0.0
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// Pet A pet for sale in the pet store
type Pet struct {
	Id *int64 `json:"id,omitempty"`
	Category *Category `json:"category,omitempty"`
	Name string `json:"name"`
	PhotoUrls []string `json:"photoUrls"`
	Tags *[]Tag `json:"tags,omitempty"`
	// pet status in the store
	Status *string `json:"status,omitempty"`
}

// NewPet instantiates a new Pet object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPet(name string, photoUrls []string) *Pet {
	this := Pet{}
	this.Name = name
	this.PhotoUrls = photoUrls
	return &this
}

// NewPetWithDefaults instantiates a new Pet object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPetWithDefaults() *Pet {
	this := Pet{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *Pet) GetId() int64 {
	if o == nil || o.Id == nil {
		var ret int64
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Pet) GetIdOk() (*int64, bool) {
	if o == nil || o.Id == nil {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *Pet) HasId() bool {
	if o != nil && o.Id != nil {
		return true
	}

	return false
}

// SetId gets a reference to the given int64 and assigns it to the Id field.
func (o *Pet) SetId(v int64) {
	o.Id = &v
}

// GetCategory returns the Category field value if set, zero value otherwise.
func (o *Pet) GetCategory() Category {
	if o == nil || o.Category == nil {
		var ret Category
		return ret
	}
	return *o.Category
}

// GetCategoryOk returns a tuple with the Category field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Pet) GetCategoryOk() (*Category, bool) {
	if o == nil || o.Category == nil {
		return nil, false
	}
	return o.Category, true
}

// HasCategory returns a boolean if a field has been set.
func (o *Pet) HasCategory() bool {
	if o != nil && o.Category != nil {
		return true
	}

	return false
}

// SetCategory gets a reference to the given Category and assigns it to the Category field.
func (o *Pet) SetCategory(v Category) {
	o.Category = &v
}

// GetName returns the Name field value
func (o *Pet) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *Pet) GetNameOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *Pet) SetName(v string) {
	o.Name = v
}

// GetPhotoUrls returns the PhotoUrls field value
func (o *Pet) GetPhotoUrls() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.PhotoUrls
}

// GetPhotoUrlsOk returns a tuple with the PhotoUrls field value
// and a boolean to check if the value has been set.
func (o *Pet) GetPhotoUrlsOk() (*[]string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.PhotoUrls, true
}

// SetPhotoUrls sets field value
func (o *Pet) SetPhotoUrls(v []string) {
	o.PhotoUrls = v
}

// GetTags returns the Tags field value if set, zero value otherwise.
func (o *Pet) GetTags() []Tag {
	if o == nil || o.Tags == nil {
		var ret []Tag
		return ret
	}
	return *o.Tags
}

// GetTagsOk returns a tuple with the Tags field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Pet) GetTagsOk() (*[]Tag, bool) {
	if o == nil || o.Tags == nil {
		return nil, false
	}
	return o.Tags, true
}

// HasTags returns a boolean if a field has been set.
func (o *Pet) HasTags() bool {
	if o != nil && o.Tags != nil {
		return true
	}

	return false
}

// SetTags gets a reference to the given []Tag and assigns it to the Tags field.
func (o *Pet) SetTags(v []Tag) {
	o.Tags = &v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *Pet) GetStatus() string {
	if o == nil || o.Status == nil {
		var ret string
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Pet) GetStatusOk() (*string, bool) {
	if o == nil || o.Status == nil {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *Pet) HasStatus() bool {
	if o != nil && o.Status != nil {
		return true
	}

	return false
}

// SetStatus gets a reference to the given string and assigns it to the Status field.
func (o *Pet) SetStatus(v string) {
	o.Status = &v
}

func (o Pet) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Id != nil {
		toSerialize["id"] = o.Id
	}
	if o.Category != nil {
		toSerialize["category"] = o.Category
	}
	if true {
		toSerialize["name"] = o.Name
	}
	if true {
		toSerialize["photoUrls"] = o.PhotoUrls
	}
	if o.Tags != nil {
		toSerialize["tags"] = o.Tags
	}
	if o.Status != nil {
		toSerialize["status"] = o.Status
	}
	return json.Marshal(toSerialize)
}

type NullablePet struct {
	value *Pet
	isSet bool
}

func (v NullablePet) Get() *Pet {
	return v.value
}

func (v *NullablePet) Set(val *Pet) {
	v.value = val
	v.isSet = true
}

func (v NullablePet) IsSet() bool {
	return v.isSet
}

func (v *NullablePet) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePet(val *Pet) *NullablePet {
	return &NullablePet{value: val, isSet: true}
}

func (v NullablePet) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePet) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


