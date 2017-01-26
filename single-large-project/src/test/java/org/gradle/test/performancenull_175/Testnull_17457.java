package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17457 {
    private final Productionnull_17457 production = new Productionnull_17457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}