package org.gradle.test.performancenull_98;

import static org.junit.Assert.*;

public class Testnull_9742 {
    private final Productionnull_9742 production = new Productionnull_9742("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}