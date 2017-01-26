package org.gradle.test.performancenull_85;

import static org.junit.Assert.*;

public class Testnull_8469 {
    private final Productionnull_8469 production = new Productionnull_8469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}