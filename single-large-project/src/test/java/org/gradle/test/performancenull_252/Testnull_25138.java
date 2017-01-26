package org.gradle.test.performancenull_252;

import static org.junit.Assert.*;

public class Testnull_25138 {
    private final Productionnull_25138 production = new Productionnull_25138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}