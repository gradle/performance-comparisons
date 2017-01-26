package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5251 {
    private final Productionnull_5251 production = new Productionnull_5251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}