package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1841 {
    private final Productionnull_1841 production = new Productionnull_1841("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}