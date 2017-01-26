package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46070 {
    private final Productionnull_46070 production = new Productionnull_46070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}