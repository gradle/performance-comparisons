package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42023 {
    private final Productionnull_42023 production = new Productionnull_42023("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}