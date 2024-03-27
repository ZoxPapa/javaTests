package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.mockito.Mockito.mock;

public class PresenterTest {
    Presenter presenter;

    @BeforeAll
    static void someBeforeAllTest(){
        System.out.println("Start testing presenter");
    }
    @AfterAll
    static void someAfterAllTest(){
        System.out.println("Presenter testing complete");
    }
    @BeforeEach
    void preparingForPresenterTest(){
        this.presenter = new Presenter();
    }
    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    void startWithCommentsTest(boolean b){

        Assertions.assertInstanceOf(Boolean.class, presenter.startTheGame(b));
    }
}
