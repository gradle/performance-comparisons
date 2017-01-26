package org.gradle.test.performancenull_272;

import static org.junit.Assert.*;

public class Testnull_27150 {
    private final Productionnull_27150 production = new Productionnull_27150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}