package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49913 {
    private final Productionnull_49913 production = new Productionnull_49913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}