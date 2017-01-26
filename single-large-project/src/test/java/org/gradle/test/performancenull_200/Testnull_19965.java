package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19965 {
    private final Productionnull_19965 production = new Productionnull_19965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}