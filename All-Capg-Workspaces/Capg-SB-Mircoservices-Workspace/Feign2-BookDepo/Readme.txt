 http://localhost:8002/depo/101
 
 O/P:
 {
  "depoID": "DEPO - 101",
  "depoAddress": "Banglore Warehouse",
  "book": {
    "bookID": "101",
    "bookName": "Spring Book",
    "bookAuthor": "Rod Johnson",
    "bookPrice": 599
  }
}

NOTE: Client will always be there where main url is. for ex: Book info is the first url which we can call 
independenlty also and depo is the main microservices folder which is fetching info of book and getting info
of book along with depo so client will be present in depo only.