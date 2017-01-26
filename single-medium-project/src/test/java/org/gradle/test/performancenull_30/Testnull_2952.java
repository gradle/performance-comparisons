package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2952 {
    private final Productionnull_2952 production = new Productionnull_2952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}