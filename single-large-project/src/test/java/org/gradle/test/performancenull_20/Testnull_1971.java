package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1971 {
    private final Productionnull_1971 production = new Productionnull_1971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}