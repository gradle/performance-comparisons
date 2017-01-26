package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30061 {
    private final Productionnull_30061 production = new Productionnull_30061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}