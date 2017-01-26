package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32631 {
    private final Productionnull_32631 production = new Productionnull_32631("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}