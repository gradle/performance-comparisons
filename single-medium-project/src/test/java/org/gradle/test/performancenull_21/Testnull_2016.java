package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2016 {
    private final Productionnull_2016 production = new Productionnull_2016("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}