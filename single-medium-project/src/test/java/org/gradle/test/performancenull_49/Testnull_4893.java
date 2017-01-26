package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4893 {
    private final Productionnull_4893 production = new Productionnull_4893("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}