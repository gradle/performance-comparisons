package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30093 {
    private final Productionnull_30093 production = new Productionnull_30093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}