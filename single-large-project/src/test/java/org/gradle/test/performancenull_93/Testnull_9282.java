package org.gradle.test.performancenull_93;

import static org.junit.Assert.*;

public class Testnull_9282 {
    private final Productionnull_9282 production = new Productionnull_9282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}