package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21470 {
    private final Productionnull_21470 production = new Productionnull_21470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}