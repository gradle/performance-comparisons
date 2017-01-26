package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25803 {
    private final Productionnull_25803 production = new Productionnull_25803("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}