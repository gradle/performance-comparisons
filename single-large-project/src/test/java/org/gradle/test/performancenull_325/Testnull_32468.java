package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32468 {
    private final Productionnull_32468 production = new Productionnull_32468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}