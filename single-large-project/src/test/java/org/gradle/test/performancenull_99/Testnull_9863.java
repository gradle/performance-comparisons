package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9863 {
    private final Productionnull_9863 production = new Productionnull_9863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}