package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12041 {
    private final Productionnull_12041 production = new Productionnull_12041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}