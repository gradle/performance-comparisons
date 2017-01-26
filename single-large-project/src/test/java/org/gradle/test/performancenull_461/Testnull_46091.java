package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46091 {
    private final Productionnull_46091 production = new Productionnull_46091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}