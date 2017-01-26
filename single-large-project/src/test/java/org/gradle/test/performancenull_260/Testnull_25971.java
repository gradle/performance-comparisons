package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25971 {
    private final Productionnull_25971 production = new Productionnull_25971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}