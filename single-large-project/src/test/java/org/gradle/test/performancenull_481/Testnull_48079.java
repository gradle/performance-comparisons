package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48079 {
    private final Productionnull_48079 production = new Productionnull_48079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}