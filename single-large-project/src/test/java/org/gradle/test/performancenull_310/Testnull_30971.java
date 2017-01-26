package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30971 {
    private final Productionnull_30971 production = new Productionnull_30971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}