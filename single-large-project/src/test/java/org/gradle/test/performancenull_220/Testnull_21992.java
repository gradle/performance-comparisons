package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21992 {
    private final Productionnull_21992 production = new Productionnull_21992("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}