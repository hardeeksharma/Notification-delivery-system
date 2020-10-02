# SYSTEM REQUIREMENTS

We should always clarify requirements at the beginning of the interview. Be sure to ask questions to find the exact scope of the system that the interviewer has in mind.

## Functional Requirements
- Users should be able to register themselves.
- Verification email is sent to user whenever he/she registers for the first time on some software system.
- User can send single notification via API.
- To send bulk nofication, user must login to the UI and attach a pre formatted CSV.
- There can be many kind of notification queues like email, whatsapp, push notification etc.
- System must decide from the request/csv payload the type of notification queue.

## Non-functional Requirements
- Password requirements – min length(8 char), encryption(bcrypt)
- 100% notification delivery
- Scalability -  Delivery queues can be increased/decreased via CLI on server.
- Availability - 24/7/365
- Performance : Each API request should be processed within 10 seconds.
- Security : JWT authentication.
- Usability. This focuses on the appearance of the user interface and how people interact with it. What colour are the screens? How big are the buttons? etc
- Load balancing capability

## Capacity Estimation and Constraints
- A user can send 1000 notification per minute.
- Can handle 500 user in day time, 150 in night time




