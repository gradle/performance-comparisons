package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30942 {
    private final Productionnull_30942 production = new Productionnull_30942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}