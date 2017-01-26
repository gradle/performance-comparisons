package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37981 {
    private final Productionnull_37981 production = new Productionnull_37981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}