package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3943 {
    private final Productionnull_3943 production = new Productionnull_3943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}