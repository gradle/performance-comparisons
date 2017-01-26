package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22968 {
    private final Productionnull_22968 production = new Productionnull_22968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}