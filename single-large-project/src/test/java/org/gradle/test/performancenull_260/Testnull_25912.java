package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25912 {
    private final Productionnull_25912 production = new Productionnull_25912("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}