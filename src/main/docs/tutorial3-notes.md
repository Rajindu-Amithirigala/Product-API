# Tutorial 3: Activity 4 notes

| Call | Status | Body |
   |---|---|---|
| POST /products (x2) | ... | ... |
| GET /products | ... | ... |
| GET /products/1 | ... | ... |
| DELETE /products/1 | ... | ... |
| GET /products (after delete) | ... | only product 2 |
| GET /products/99 | ... | ... |

**The 404 experiment:** GET /products/99 returned status ___ with an
empty body. That's the wrong answer because 200 means "OK, here is
what you asked for", but there was nothing to give. It should be
404 Not Found with a message. This is fixed properly in Lecture 6.