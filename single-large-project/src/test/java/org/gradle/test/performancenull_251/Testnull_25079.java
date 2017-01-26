package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25079 {
    private final Productionnull_25079 production = new Productionnull_25079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}