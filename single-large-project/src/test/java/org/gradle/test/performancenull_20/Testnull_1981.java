package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1981 {
    private final Productionnull_1981 production = new Productionnull_1981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}