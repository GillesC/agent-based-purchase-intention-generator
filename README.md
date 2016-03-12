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
(X, Y) km (MAX , MIN) -> generate random number (based on distance away) between MAX and MIN,
this will be the chance the consumer is willing to drive to a collection point
who is between X and Y km away from his house.

The `willingnessToDriveFurther` parameter will adjust the `distanceWillingToDrive`
parameters according.

This will be statically declared in the config.xml file, for example:
```xml
<willingnessToDriveFurther>0.8</willingnessToDriveFurther>
<distanceWillingToDrive>
<close>
    <min-dist>0</min-dist>
    <max-dist>5</max-dist>
    <min-chance>1</min-chance>
    <max-chance>0.8</max-chance>
</close>
<medium>
    <min-dist>5</min-dist>
    <max-dist>10</max-dist>
    <min-chance>0.8</min-chance>
    <max-chance>0.4</max-chance>
</medium>
<far>
    <min-dist>10</min-dist>
    <max-dist>1000</max-dist>
    <min-chance>0.5</min-chance>
    <max-chance>0</max-chance>
</far>
```
