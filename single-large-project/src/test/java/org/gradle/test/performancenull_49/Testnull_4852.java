package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4852 {
    private final Productionnull_4852 production = new Productionnull_4852("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}