package org.gradle.test.performancenull_189;

import static org.junit.Assert.*;

public class Testnull_18868 {
    private final Productionnull_18868 production = new Productionnull_18868("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}