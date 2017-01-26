package org.gradle.test.performancenull_319;

import static org.junit.Assert.*;

public class Testnull_31862 {
    private final Productionnull_31862 production = new Productionnull_31862("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}