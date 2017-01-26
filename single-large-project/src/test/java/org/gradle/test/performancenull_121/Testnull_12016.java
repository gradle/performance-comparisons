package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12016 {
    private final Productionnull_12016 production = new Productionnull_12016("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}