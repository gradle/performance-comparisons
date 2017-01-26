package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3952 {
    private final Productionnull_3952 production = new Productionnull_3952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}