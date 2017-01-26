package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21440 {
    private final Productionnull_21440 production = new Productionnull_21440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}