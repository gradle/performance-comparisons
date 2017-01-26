package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12061 {
    private final Productionnull_12061 production = new Productionnull_12061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}