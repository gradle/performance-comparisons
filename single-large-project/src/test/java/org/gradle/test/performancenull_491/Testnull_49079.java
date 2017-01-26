package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49079 {
    private final Productionnull_49079 production = new Productionnull_49079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}