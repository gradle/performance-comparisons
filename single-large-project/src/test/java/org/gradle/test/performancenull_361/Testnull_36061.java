package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36061 {
    private final Productionnull_36061 production = new Productionnull_36061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}