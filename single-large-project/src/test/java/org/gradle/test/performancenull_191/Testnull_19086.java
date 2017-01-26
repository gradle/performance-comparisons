package org.gradle.test.performancenull_191;

import static org.junit.Assert.*;

public class Testnull_19086 {
    private final Productionnull_19086 production = new Productionnull_19086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}