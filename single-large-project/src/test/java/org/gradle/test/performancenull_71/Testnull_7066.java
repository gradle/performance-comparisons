package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7066 {
    private final Productionnull_7066 production = new Productionnull_7066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}