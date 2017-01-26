package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17444 {
    private final Productionnull_17444 production = new Productionnull_17444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}