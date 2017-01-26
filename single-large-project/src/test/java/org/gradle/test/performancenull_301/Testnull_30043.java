package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30043 {
    private final Productionnull_30043 production = new Productionnull_30043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}