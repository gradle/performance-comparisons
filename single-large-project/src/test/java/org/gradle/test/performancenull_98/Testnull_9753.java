package org.gradle.test.performancenull_98;

import static org.junit.Assert.*;

public class Testnull_9753 {
    private final Productionnull_9753 production = new Productionnull_9753("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}