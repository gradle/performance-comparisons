package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42012 {
    private final Productionnull_42012 production = new Productionnull_42012("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}