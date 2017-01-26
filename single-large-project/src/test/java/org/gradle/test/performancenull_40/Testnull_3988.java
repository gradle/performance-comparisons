package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3988 {
    private final Productionnull_3988 production = new Productionnull_3988("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}