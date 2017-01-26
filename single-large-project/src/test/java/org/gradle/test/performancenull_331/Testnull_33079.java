package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33079 {
    private final Productionnull_33079 production = new Productionnull_33079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}