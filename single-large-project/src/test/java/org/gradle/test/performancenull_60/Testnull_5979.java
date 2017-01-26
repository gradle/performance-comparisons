package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5979 {
    private final Productionnull_5979 production = new Productionnull_5979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}