package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21468 {
    private final Productionnull_21468 production = new Productionnull_21468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}