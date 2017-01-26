package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39968 {
    private final Productionnull_39968 production = new Productionnull_39968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}