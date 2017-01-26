package org.gradle.test.performancenull_39;

import static org.junit.Assert.*;

public class Testnull_3852 {
    private final Productionnull_3852 production = new Productionnull_3852("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}