package org.gradle.test.performancenull_191;

import static org.junit.Assert.*;

public class Testnull_19082 {
    private final Productionnull_19082 production = new Productionnull_19082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}