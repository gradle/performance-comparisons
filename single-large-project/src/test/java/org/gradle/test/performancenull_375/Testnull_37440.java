package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37440 {
    private final Productionnull_37440 production = new Productionnull_37440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}