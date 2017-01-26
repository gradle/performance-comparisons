package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2018 {
    private final Productionnull_2018 production = new Productionnull_2018("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}