package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4962 {
    private final Productionnull_4962 production = new Productionnull_4962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}