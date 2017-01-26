package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5083 {
    private final Productionnull_5083 production = new Productionnull_5083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}