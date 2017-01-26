package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34063 {
    private final Productionnull_34063 production = new Productionnull_34063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}