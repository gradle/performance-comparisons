package org.gradle.test.performancenull_96;

import static org.junit.Assert.*;

public class Testnull_9531 {
    private final Productionnull_9531 production = new Productionnull_9531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}