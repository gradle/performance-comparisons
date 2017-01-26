package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35066 {
    private final Productionnull_35066 production = new Productionnull_35066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}