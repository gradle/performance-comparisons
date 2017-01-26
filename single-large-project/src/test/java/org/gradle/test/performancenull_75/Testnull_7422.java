package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7422 {
    private final Productionnull_7422 production = new Productionnull_7422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}