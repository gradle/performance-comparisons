package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9852 {
    private final Productionnull_9852 production = new Productionnull_9852("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}