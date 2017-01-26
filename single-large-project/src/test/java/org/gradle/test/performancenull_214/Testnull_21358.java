package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21358 {
    private final Productionnull_21358 production = new Productionnull_21358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}