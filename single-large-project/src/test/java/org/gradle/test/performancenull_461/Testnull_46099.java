package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46099 {
    private final Productionnull_46099 production = new Productionnull_46099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}