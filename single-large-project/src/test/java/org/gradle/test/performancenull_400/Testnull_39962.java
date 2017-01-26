package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39962 {
    private final Productionnull_39962 production = new Productionnull_39962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}