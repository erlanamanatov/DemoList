package com.erkprog.mocklistdemo

const val CLIENT_ID_1 = "e0ec7749-9e46-4518-bc90-ef4321d2c9b8"
const val CLIENT_NAME_1 = "Marci Cleave"
const val CLIENT_EMAIL_1 = "mcleave0@craigslist.org"
const val CLIENT_PHONE_1 = "502-472-5071"
const val CLIENT_COMPANY_NAME_1 = "Ecology Landscape"
const val CLIENT_STREET_ADDRESS_1 = "64 Sachs Crossing"
const val CLIENT_STREET_ADDRESS_2 = "Suite 1009"
const val CLIENT_CITY_1 = "Oklahoma City"
const val CLIENT_STATE_1 = "Oklahoma"
const val CLIENT_ZIP_1 = "90839"
const val CLIENT_COUNTRY_1 = "USA"
const val CLIENT_NOTE_1 = "Closed on Thurdsays, ask for Nancy to make appointments"

fun getSampleClients(): List<Client> {
    val clientList = mutableListOf<Client>()

    val client1 = Client(
        CLIENT_ID_1,
        CLIENT_NAME_1,
        CLIENT_EMAIL_1,
        CLIENT_PHONE_1,
        CLIENT_COMPANY_NAME_1,
        CLIENT_STREET_ADDRESS_1,
        CLIENT_STREET_ADDRESS_2,
        "",
        CLIENT_CITY_1,
        CLIENT_ZIP_1,
        CLIENT_STATE_1,
        CLIENT_COUNTRY_1,
        CLIENT_NOTE_1,
        System.currentTimeMillis(),
        System.currentTimeMillis()
    )
    clientList.add(client1)

    val client2 = Client(
        "59f0c8e1-a459-4d77-b5bf-f6fc0374c955",
        "Tomkin Filintsev",
        "tfilintsev1@senate.gov",
        "425-652-1610",
        "Green Pool Service",
        "43985 Schmedeman Road",
        "Suite 209",
        "",
        "Denver",
        "78790",
        "Colorado",
        "USA",
        "Paid their invoice quick, good company to work with",
        System.currentTimeMillis(),
        System.currentTimeMillis()
    )
    clientList.add(client2)

    val client3 = Client(
        "8cfb0455-9a5c-4399-9315-85f1ea14529f",
        "Lynde Qualtro",
        "lqualtro2@prweb.com",
        "425-725-8345",
        "Steel Works, LLC",
        "7894 Atlantic Blvd",
        "Suite 309",
        "",
        "Phoenix",
        "32908",
        "AZ",
        "USA",
        "Vestibulum ac est lacinia nisi venenatis tristique. Fusce congue, diam id ornare imperdiet,",
        System.currentTimeMillis(),
        System.currentTimeMillis()
    )
    clientList.add(client3)


    val client4 = Client(
        "8bbb8f9a-9838-460d-9a86-851eccc51982",
        "Sammy Pierrepont",
        "spierrepont3@earthlink.net",
        "405-325-6607",
        "Emily Hair Salong",
        "5 Trailsway Court",
        "Suite 23",
        "",
        "Louisville",
        "90839",
        "Kentucky",
        "USA",
        "Use the side gate to access the pool. Service every other Friday",
        System.currentTimeMillis(),
        System.currentTimeMillis()
    )
    clientList.add(client4)

    val client5 = Client(
        "ad806163-4288-49f5-8f6d-85eefdbdcf73",
        "Selie Hrachovec",
        "shrachovec4@paypal.com",
        "336-786-9963",
        "Spring Pizza Delivery",
        "75354 Maryland Parkway",
        "",
        "",
        "Seattle",
        "67386",
        "Washington",
        "USA",
        "Project is on hold pending permit, follow up in 2 weeks",
        System.currentTimeMillis(),
        System.currentTimeMillis()
    )
    clientList.add(client5)

    val client6 = Client(
        "83793931-7e44-4b28-855b-85188016dc15",
        "Leonerd Klimov",
        "lklimov6@cdbaby.com",
        "303-239-5261",
        "Best Garden Salad, LLC",
        "64 Sachs Crossing",
        "Suite 1009",
        "",
        "Oklahoma City",
        "90839",
        "Oklahoma",
        "USA",
        "Check the drywall on next visit, client reported molding",
        System.currentTimeMillis(),
        System.currentTimeMillis()
    )
    clientList.add(client6)

    val client7 = Client(
        "9b6035f6-3f81-4046-ab88-0a1232c6c758",
        "Townie Hartigan",
        "thartigan8@live.com",
        "806-905-5183",
        "Future Kings Preschool",
        "73818 Morrow Plaza",
        "",
        "",
        "Greensboro",
        "29065",
        "North Carolina",
        "USA",
        "No through traffic, park in the cul de sac on service days",
        System.currentTimeMillis(),
        System.currentTimeMillis()
    )
    clientList.add(client7)

    val client8 = Client(
        "79bbc302-7ec4-4d1c-8806-1a2dd8a5fc80",
        "Doyle Upcraft",
        "dupcraft9@list-manage.com",
        "706-923-1668",
        "Hospital Delivery Van, LLC",
        "2848 Artisan Way",
        "Suite 1009",
        "",
        "Alpharetta",
        "98080",
        "Georgia",
        "USA",
        "Mr. Raul is the point of contact, get his sign off for all projects",
        System.currentTimeMillis(),
        System.currentTimeMillis()
    )
    clientList.add(client8)

    val client9 = Client(
        "92203a9a-097b-4b89-a440-dcde316b6d74",
        "Hardy Tethcote",
        "htethcotea@buzzfeed.com",
        "719-966-0123",
        "Quick Milk Dispenser, Inc",
        "43985 Schmedeman Road",
        "",
        "",
        "Denver",
        "78790",
        "Colorado",
        "USA",
        "Garbage disposal upstairs is not working, bring replacement",
        System.currentTimeMillis(),
        System.currentTimeMillis()
    )
    clientList.add(client9)

    val client10 = Client(
        "10d33492-88e5-4c20-bf86-eed4f003f705",
        "Jame DOE",
        "jamesdoe@gmail.com",
        "908746783",
        "Fancy Dentist CompanyInfo",
        "43985 Schmedeman Road",
        "",
        "",
        "Denver",
        "78790",
        "Colorado",
        "USA",
        "The office next door needs a roofing and solar quote",
        System.currentTimeMillis(),
        System.currentTimeMillis()
    )
    clientList.add(client10)

    return clientList
}