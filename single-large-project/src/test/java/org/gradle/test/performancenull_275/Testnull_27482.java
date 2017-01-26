package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27482 {
    private final Productionnull_27482 production = new Productionnull_27482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}