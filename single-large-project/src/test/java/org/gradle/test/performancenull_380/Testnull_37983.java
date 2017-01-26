package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37983 {
    private final Productionnull_37983 production = new Productionnull_37983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}