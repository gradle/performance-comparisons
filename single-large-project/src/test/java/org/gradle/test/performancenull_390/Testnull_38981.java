package org.gradle.test.performancenull_390;

import static org.junit.Assert.*;

public class Testnull_38981 {
    private final Productionnull_38981 production = new Productionnull_38981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}