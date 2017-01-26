package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32641 {
    private final Productionnull_32641 production = new Productionnull_32641("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}