package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2431 {
    private final Productionnull_2431 production = new Productionnull_2431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}