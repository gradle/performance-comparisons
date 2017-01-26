package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30055 {
    private final Productionnull_30055 production = new Productionnull_30055("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}