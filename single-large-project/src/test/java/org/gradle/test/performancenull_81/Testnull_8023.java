package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8023 {
    private final Productionnull_8023 production = new Productionnull_8023("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}