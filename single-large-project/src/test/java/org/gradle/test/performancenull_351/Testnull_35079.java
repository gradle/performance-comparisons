package org.gradle.test.performancenull_351;

import static org.junit.Assert.*;

public class Testnull_35079 {
    private final Productionnull_35079 production = new Productionnull_35079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}