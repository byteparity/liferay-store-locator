create table ByteParity_StoreInformation (
	uuid_ VARCHAR(75) null,
	storeId LONG not null primary key,
	storeName VARCHAR(75) null,
	address1 VARCHAR(75) null,
	address2 VARCHAR(75) null,
	city VARCHAR(75) null,
	state_ VARCHAR(75) null,
	country VARCHAR(75) null,
	zip VARCHAR(75) null,
	phone VARCHAR(75) null,
	latitude VARCHAR(75) null,
	longitude VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	createdBy LONG,
	createDate DATE null,
	modifiedDate DATE null
);