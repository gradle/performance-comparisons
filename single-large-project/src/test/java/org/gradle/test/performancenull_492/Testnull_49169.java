package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49169 {
    private final Productionnull_49169 production = new Productionnull_49169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}