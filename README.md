# Liferay Store Locator

A simple store locator to showcase the stores stored in back end into a google map location view. A distance based filter helps user to find the store within given distance. It requires geo location fields to be entered via backend. 

A common usecase: Photo studio association or company needs to show list of all the studios around the world, which comes under their association, they can add/edit stores by admin view of the portal and end-user can see list of the studios and also they can filter nearer studios based on their current location.

## Store locator component has below capabilities.
*	Add/edit stores
*	Featured with google maps to empower visualization of the location of the stores
*	Filter based on distance - Miles/Kilometers powered by ElasticSearch

## Environment

* Liferay 7 - GA4 +
*	MySQL 5.6 +
*	Elastic Search

## How to use

1. Download, build and install store location entities jars on your server.
2. Check module status in liferay tomcat server using console log OR using gogo shell.
3. Add StoreLocationAdmin Portlet on a specific page to add/edit stores.

Please note that, StoreLocation Admin Portlet and StoreLocation View Portlet are exists under Byteparity category as shown in below snapshot.

![ScreenShot](https://user-images.githubusercontent.com/24852574/43137011-25fe26ec-8f68-11e8-9eeb-acac95246d75.PNG)


You should add Google API Key from the configuration of portlet. We have used Google API to get address information, Latitude & Longitude in admin portlet and Maps API in view portlet.


![ScreenShot](https://user-images.githubusercontent.com/24852574/43137101-7261bf26-8f68-11e8-8e2e-fbd8888d8fb1.PNG)

![ScreenShot](https://user-images.githubusercontent.com/24852574/44019347-162df294-9efc-11e8-8573-b3afb02451c3.PNG)

After adding several stores you can see how it looks in view portlet for end-user.
   
![ScreenShot](https://user-images.githubusercontent.com/24852574/43137227-e773e30c-8f68-11e8-828d-22462f4718be.PNG)


![ScreenShot](https://user-images.githubusercontent.com/24852574/43137270-08f32498-8f69-11e8-81e1-38628c78e93a.PNG)


4. For stores view by end user, add StoreLocation view portlet on a specific page.


![ScreenShot](https://user-images.githubusercontent.com/24852574/43137336-3793b0f6-8f69-11e8-8057-5bd9f6b180cc.PNG)

You should add Google API Key & check Enable Search Filter from the configuration of portlet. 
We have used Google API to get the location of the stores in the map. For Enable Search Filter option if you mark as a ticked then filter search option will be visible in the UI and it won’t be visible for vice versa case.

![ScreenShot](https://user-images.githubusercontent.com/24852574/43137383-64e52ad0-8f69-11e8-9838-71c5d9b58060.PNG)

![ScreenShot](https://user-images.githubusercontent.com/24852574/44019421-5c4a4a3e-9efc-11e8-93ad-74272c07e1e1.PNG)

With the help of GeoDistanceFilter class, we are able to search stores around the location of current user. We need to select distance unit either Mile or Kilometer and add the distance within which list of stores should appear. After that we will get the list of stores in the radius of current user's location. By default it will display all the stores.

![ScreenShot](https://user-images.githubusercontent.com/24852574/43137565-b09dec1e-8f69-11e8-8853-0ad49c5c3cec.PNG)

![ScreenShot](https://user-images.githubusercontent.com/24852574/43137590-c7359738-8f69-11e8-82f2-b6ad47782dce.PNG)

## Support
   Please feel free to contact us on hello@byteparity.com for any issue/suggestions.
