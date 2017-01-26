package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46097 {
    private final Productionnull_46097 production = new Productionnull_46097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}