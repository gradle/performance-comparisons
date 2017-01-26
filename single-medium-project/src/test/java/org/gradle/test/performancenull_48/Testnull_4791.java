package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4791 {
    private final Productionnull_4791 production = new Productionnull_4791("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}