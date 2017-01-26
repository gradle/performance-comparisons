package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39913 {
    private final Productionnull_39913 production = new Productionnull_39913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}