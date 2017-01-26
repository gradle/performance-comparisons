package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47962 {
    private final Productionnull_47962 production = new Productionnull_47962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}