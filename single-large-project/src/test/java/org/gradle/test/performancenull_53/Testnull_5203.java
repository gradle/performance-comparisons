package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5203 {
    private final Productionnull_5203 production = new Productionnull_5203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}