package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47971 {
    private final Productionnull_47971 production = new Productionnull_47971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}