package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5282 {
    private final Productionnull_5282 production = new Productionnull_5282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}