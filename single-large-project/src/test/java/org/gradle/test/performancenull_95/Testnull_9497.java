package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9497 {
    private final Productionnull_9497 production = new Productionnull_9497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}