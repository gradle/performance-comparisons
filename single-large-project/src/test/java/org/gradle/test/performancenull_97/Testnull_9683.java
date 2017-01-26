package org.gradle.test.performancenull_97;

import static org.junit.Assert.*;

public class Testnull_9683 {
    private final Productionnull_9683 production = new Productionnull_9683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}