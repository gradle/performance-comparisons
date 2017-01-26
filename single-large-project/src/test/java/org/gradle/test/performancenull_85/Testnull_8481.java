package org.gradle.test.performancenull_85;

import static org.junit.Assert.*;

public class Testnull_8481 {
    private final Productionnull_8481 production = new Productionnull_8481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}