package org.gradle.test.performancenull_238;

import static org.junit.Assert.*;

public class Testnull_23748 {
    private final Productionnull_23748 production = new Productionnull_23748("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}