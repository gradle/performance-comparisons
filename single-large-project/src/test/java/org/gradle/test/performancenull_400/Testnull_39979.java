package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39979 {
    private final Productionnull_39979 production = new Productionnull_39979("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}