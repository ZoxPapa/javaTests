package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class ServiceTest {
    Service service;

    @BeforeEach
    void preparingForServiceTest(){
        this.service = new Service();
    }

    @RepeatedTest(10)
    void switchPlayerDoorTest(){
        service.getPlayerRandomChoice();
        Assertions.assertTrue(service.playerChoice>=0 && service.playerChoice<3);
    }

    @RepeatedTest(100)
    void checkHostAndPlayerDoorsDifference(){
        service.getPlayerRandomChoice();
        service.getHostChoice();

        Assertions.assertNotEquals(service.playerChoice, service.hostChoice);
    }

    @Test
    void checkWingTest(){
        service.playerChoice = 1;
        String prize = service.getDoorsStand().getPRIZE();
        service.getDoorsStand().doors.put(1, prize);

        Assertions.assertTrue(service.checkWin());
    }
    @ParameterizedTest
    @ValueSource(ints = {-123, -1, 3, 1432})
    void checkIncorrectDoorNumber(int n){
        service.playerChoice = n;

        Assertions.assertThrows(NullPointerException.class,()-> service.checkWin());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2})
    void checkCorrectDoorNumber(int n){
        service.playerChoice = n;
        Assertions.assertInstanceOf(Boolean.class, service.checkWin());
    }



}
