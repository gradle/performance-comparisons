package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3079 {
    private final Productionnull_3079 production = new Productionnull_3079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}