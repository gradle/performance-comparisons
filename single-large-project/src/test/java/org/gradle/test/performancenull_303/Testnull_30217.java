package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30217 {
    private final Productionnull_30217 production = new Productionnull_30217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}