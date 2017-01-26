package org.gradle.test.performancenull_98;

import static org.junit.Assert.*;

public class Testnull_9745 {
    private final Productionnull_9745 production = new Productionnull_9745("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}