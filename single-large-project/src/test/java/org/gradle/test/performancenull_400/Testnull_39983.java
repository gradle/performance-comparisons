package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39983 {
    private final Productionnull_39983 production = new Productionnull_39983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}