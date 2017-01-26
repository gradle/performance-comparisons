package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30902 {
    private final Productionnull_30902 production = new Productionnull_30902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}