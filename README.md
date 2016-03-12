# Agent-based Purchase Intention Generator
[School project]
This application will generate deliveries made by agents based on real human purchase behaviour.

## TODO
1. Creating global config file to manipulate agent profile generation
2. Generation of delivery locations (XML)
3. Making profile files for products, agents and shop
    - Products static: product_name, price, category
    - Static mapping category_<-> need_recognizing
    - Generate random agent profiles ased on global config file
    - Static shop (see shopprifile class)
4. Design algorithm to make a decision based on the profiles and randomises

## Done
1. Profile file (can be updated over time):
    - Agent
    - Shop
    
## Collection point
Algorithm to choose if consumer will drive a distance to collect his order:

In the global config.xml file:
< X km (MAX , MIN) -> generate random number between MAX and MIN,
this will be the chance the consumer is willing to drive to a collection point
who is X km away from his house.

This will be statically declared in the config.xml file, for example:
<5 km (100,80)
< 10km (80,60)
> 10km (60,0)