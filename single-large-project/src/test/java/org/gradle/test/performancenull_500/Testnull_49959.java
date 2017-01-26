package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49959 {
    private final Productionnull_49959 production = new Productionnull_49959("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}