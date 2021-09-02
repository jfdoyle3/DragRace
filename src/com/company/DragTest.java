package com.company;

public class DragTest {

//    2020 Ford Mustang Shelby GT500: 760-horsepower ,
//                                    625 pound-feet of torque,
//                                    180mph max,
//                                    Up to 12/18 mpg (city/highway)
    //                                4,080 pounds / 4225 pounds
    //-----------------------------------------------------------------
//    2020 Tesla Model S:             778-Horsepower
    // https://www.autolist.com/guides/average-car-horsepower
  // https://www.calculator.net/engine-horsepower-calculator.html?v2weight=4080&v2weightunit=pound&v2speed=60&v2speedunit=mph&calctype=trap&x=38&y=17#tsm
//https://www.motor1.com/news/386412/2020-shelby-gt500-weight/

    public static void accelerate() {
        int speed, mileageTraveling, turn, totalMileage, horsePower, weight, gasTank, maxSpeed;

        //   start engine()

        //Engine
        horsePower = 69;
        maxSpeed = 180;

        // Car
        weight = 100;
        gasTank = 16;
        speed = 0;

        // Race
        turn = 0;
        totalMileage = 500;
        mileageTraveling = 0;

        //  acc.
        //* speed +=horsepower/4 [(- totalWeight(persons)/2000)]
        speed += horsePower / 4;
        // TODO: DUPE
//        if(speed>maxSpeed)
//            speed=maxSpeed;

        // TODO: LOOP
        for(int acc=0; acc<5; acc++) {
            System.out.println("Accelerate");
            System.out.println("turn: " + turn);
            System.out.println("** speed: " + speed);
            System.out.println("max: " + maxSpeed);


            if (acc==2)
                speed++;
            // TODO: DUPE
            if(speed>maxSpeed)
                speed=maxSpeed;

            mileageTraveling += speed;
            System.out.println("Traveled: " + mileageTraveling + " miles || end mile " + totalMileage);
            if(mileageTraveling>=totalMileage){
                System.out.println("End Race");
                break;
            }
            turn++;
            System.out.println("<--------------------------------------------->");
        }


        //* speed !> max speed
        //* mileagetraveling+=speed : after menu choice ,car is always moving
        //* turn/time ++

    }
}
