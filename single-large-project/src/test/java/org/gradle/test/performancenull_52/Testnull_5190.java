package org.gradle.test.performancenull_52;

import static org.junit.Assert.*;

public class Testnull_5190 {
    private final Productionnull_5190 production = new Productionnull_5190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}