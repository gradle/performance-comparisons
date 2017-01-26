package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19954 {
    private final Productionnull_19954 production = new Productionnull_19954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}