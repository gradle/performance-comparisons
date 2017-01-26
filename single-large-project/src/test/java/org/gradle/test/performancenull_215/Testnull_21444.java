package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21444 {
    private final Productionnull_21444 production = new Productionnull_21444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}