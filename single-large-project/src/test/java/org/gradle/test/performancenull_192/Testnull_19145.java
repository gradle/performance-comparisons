package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19145 {
    private final Productionnull_19145 production = new Productionnull_19145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}