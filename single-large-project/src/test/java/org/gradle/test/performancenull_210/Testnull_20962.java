package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20962 {
    private final Productionnull_20962 production = new Productionnull_20962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}