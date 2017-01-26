package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37975 {
    private final Productionnull_37975 production = new Productionnull_37975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}