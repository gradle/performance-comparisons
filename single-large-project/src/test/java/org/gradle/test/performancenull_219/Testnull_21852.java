package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21852 {
    private final Productionnull_21852 production = new Productionnull_21852("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}