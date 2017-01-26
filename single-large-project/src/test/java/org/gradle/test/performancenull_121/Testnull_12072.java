package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12072 {
    private final Productionnull_12072 production = new Productionnull_12072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}