package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21401 {
    private final Productionnull_21401 production = new Productionnull_21401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}