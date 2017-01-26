package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27419 {
    private final Productionnull_27419 production = new Productionnull_27419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}