package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2483 {
    private final Productionnull_2483 production = new Productionnull_2483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}