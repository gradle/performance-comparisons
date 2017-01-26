package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46063 {
    private final Productionnull_46063 production = new Productionnull_46063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}