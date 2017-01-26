package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2961 {
    private final Productionnull_2961 production = new Productionnull_2961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}