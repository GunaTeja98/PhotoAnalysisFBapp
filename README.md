Group Members:

Shixin Hu

Vaibhav Vishal

Mostafa Radwan

Venkata Guna Teja


### 1) Introduction

Name : Facebook Review Guide

FB Application URL:https://developers.facebook.com/apps/2404782669818429/dashboard/ 

GAE URl: https://project1-295919.wl.r.appspot.com/


### 2) Description

This Facebook app called “Facebook Photo Review guide” allows Facebook users to run an analysis on their photos, retrieved from their Facebook account. The Google Vision API is used to detect "labels" on selected photos. Based on those labels, our application will provide a brief analysis report to user, which will give an insight on the likes from his/her followers/friends. A date range selection is also used here which will allow users to select the date range in which the analysis should be done on their photos.
This application will enable user to take and upload more photos related to the labels detected on maximum liked photos and avoid uploading those which have labels with less/minimum likes. So, the user can post the photos by keeping in mind our app analysis and gain more reach, likes and followers on Facebook.

This is  a screenshot of our shared Github repository:


![git](https://user-images.githubusercontent.com/50223742/100991329-bbfe9900-3507-11eb-9a12-5f978b6f7a87.png)


This a screenshot of commit history on our Gitthib page:


![commit](https://user-images.githubusercontent.com/50223742/100991403-ce78d280-3507-11eb-84c5-6911b2dc69bb.png)


Filenames with their description is as follows:

Maxphoto.jsp displays maximum liked photos in user's fb account

Minphotos.jsp displays minimum liked photos in user's fb account

maxPhotsAnalytics.jsp gets labeled analysis for the maximum liked photos from Google Vision API

getData.java is used to parse the json response from Vision api. It gets the data we need and stores on Google Datastore

MaxPhotos.java filters the max liked photo and date then sends to front-end of application

MinPhotos.java filters the minimum liked photo and date selected then sends them to front-end of application4

MaxPhotosAnalytics.java gets the Google Vision API result based on the image url
  

### 3) Demonstration of Application working

![1](https://user-images.githubusercontent.com/50223742/100994270-45639a80-350b-11eb-906a-db6094aadd41.png)



![2](https://user-images.githubusercontent.com/50223742/100994278-47c5f480-350b-11eb-8963-e2e8501bee02.png)



![3](https://user-images.githubusercontent.com/50223742/100994291-498fb800-350b-11eb-9fe6-c16f818e8864.png)



![4](https://user-images.githubusercontent.com/50223742/100994298-4b597b80-350b-11eb-8767-35cacdedbf23.png)



![5](https://user-images.githubusercontent.com/50223742/100994319-501e2f80-350b-11eb-8183-875bc9374869.png)



![6](https://user-images.githubusercontent.com/50223742/100994325-53192000-350b-11eb-883b-713aa7b5c5f3.png)



![7](https://user-images.githubusercontent.com/50223742/100994349-57ddd400-350b-11eb-8728-3ed259d3339f.png)



![8](https://user-images.githubusercontent.com/50223742/100994355-5a402e00-350b-11eb-9741-89274012f056.png)



![9](https://user-images.githubusercontent.com/50223742/100994373-5f04e200-350b-11eb-8251-85d0d84d672e.png)



![10](https://user-images.githubusercontent.com/50223742/100994381-61ffd280-350b-11eb-8884-5d6f870fb10f.png)



![11](https://user-images.githubusercontent.com/50223742/100994407-662bf000-350b-11eb-8201-ce5ccd4801c4.png)


In order to be more realistic and see working of our app in real world, we asked one of our friends to use the app through his fb id and send us the screenshots of his usage and results, as follows:



![12](https://user-images.githubusercontent.com/50223742/100994414-688e4a00-350b-11eb-80a6-fd38098602c6.png)



![13](https://user-images.githubusercontent.com/50223742/100994426-6af0a400-350b-11eb-85d2-dab0e0f951f4.png)


![14](https://user-images.githubusercontent.com/50223742/100994430-6d52fe00-350b-11eb-9adc-4723c5c1c9e4.png)


![15](https://user-images.githubusercontent.com/50223742/100994445-704dee80-350b-11eb-9372-7dee1fa0e381.png)


![16](https://user-images.githubusercontent.com/50223742/100994449-7217b200-350b-11eb-9a1c-cf56217f0825.png)


![17](https://user-images.githubusercontent.com/50223742/100994459-747a0c00-350b-11eb-86f4-c2b8f2a548a1.png)



### 4) GAE Issues & GAE Datastore
 
GAE Issues: No major issues encountered in GAE. Everything updating, storing and working correctly.

In Facebook Photo Guide, as and when user checkmarks the box agreeing to confirm the use of user's fb data and clicks on "Retrieve photos" button, all the photos in user's fb account are fetched and stored in Google datastore. The photos are stored with their properties like data created, likes received, user data.

When max liked photo button is clicked, then the maximum liked photo within the selected date range is returned by querying the date and like of photos.

When min liked photo button is clicked, then the minimum liked photo within the selected date range is returned by querying the date and like of photos.

Our Google App Engine's dashboard with app usage is displayed in following screenshot


![gae usage](https://user-images.githubusercontent.com/50223742/101001813-74323e80-3514-11eb-8193-acbac56109d4.png)


 This is our Google Datastore used to store all photos of users with their properrties:


![gae ds](https://user-images.githubusercontent.com/50223742/101001822-772d2f00-3514-11eb-90f4-7f2d136f430d.png)


Min liked photos in application before uploading a new photo on user's fb account:

![0](https://user-images.githubusercontent.com/50223742/101001181-a42d1200-3513-11eb-98f1-039c632d4361.png)

When a new photo is uploaded on fb account:


![1](https://user-images.githubusercontent.com/50223742/101001190-a8592f80-3513-11eb-9e13-3b63a2c718f9.png)


![2](https://user-images.githubusercontent.com/50223742/101001199-abecb680-3513-11eb-9031-3b0fec29b796.png)

New photo is available now in application, user can see it by updating date range to current date and selecting min liked photos:


![2 5](https://user-images.githubusercontent.com/50223742/101001203-ae4f1080-3513-11eb-99f5-5c9a15650397.png)



![3](https://user-images.githubusercontent.com/50223742/101001210-b018d400-3513-11eb-9c11-48fe0b0bf8f0.png)

Analytics of newly uploaded photo:


![4](https://user-images.githubusercontent.com/50223742/101001225-b313c480-3513-11eb-8419-ff3a51a666d4.png)

In Datastore, one can see the change as the new pic has been added in it. 

When the photo does not have any likes, in datastore one can view the key of photo and number of likes it has:


![0 like in ds](https://user-images.githubusercontent.com/50223742/101001250-bd35c300-3513-11eb-8cb7-798afa7eb0e2.png)

The photo can now be liked once:


![like the new pic](https://user-images.githubusercontent.com/50223742/101001266-c0c94a00-3513-11eb-95fa-0de17e98512e.png)

In datastore, for the same key value, the number of like now increases by 1


![1 like in ds](https://user-images.githubusercontent.com/50223742/101001274-c45cd100-3513-11eb-92fa-22a140c0e87d.png)


### 5) Java Documentation

Java files in our application:

getData.java is used to parse the json response from Vision api. It gets the data we need and stores on Google Datastore

MaxPhotos.java filters the max liked photo and date then sends to front-end of application

MinPhotos.java filters the minimum liked photo and date selected then sends them to front-end of application4

MaxPhotosAnalytics.java gets the Google Vision API result based on the image url

### 6) Code

https://github.com/mostaradwan/facebook-app

### 7)Youtube Video

https://www.youtube.com/watch?v=cXTlO4XYWvE&feature=youtu.be

### 8)Analytics

https://github.com/mostaradwan/facebook-app/blob/main/Analytics%20report.pdf
