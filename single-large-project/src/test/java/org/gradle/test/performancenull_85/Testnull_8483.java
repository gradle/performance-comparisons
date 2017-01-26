package org.gradle.test.performancenull_85;

import static org.junit.Assert.*;

public class Testnull_8483 {
    private final Productionnull_8483 production = new Productionnull_8483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}