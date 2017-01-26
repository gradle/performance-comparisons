package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28079 {
    private final Productionnull_28079 production = new Productionnull_28079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}