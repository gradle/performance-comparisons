package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2100 {
    private final Productionnull_2100 production = new Productionnull_2100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}