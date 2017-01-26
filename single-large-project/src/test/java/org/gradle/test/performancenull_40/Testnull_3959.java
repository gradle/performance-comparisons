package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3959 {
    private final Productionnull_3959 production = new Productionnull_3959("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}