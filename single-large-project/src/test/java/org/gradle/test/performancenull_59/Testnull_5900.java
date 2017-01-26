package org.gradle.test.performancenull_59;

import static org.junit.Assert.*;

public class Testnull_5900 {
    private final Productionnull_5900 production = new Productionnull_5900("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}