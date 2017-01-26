package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47283 {
    private final Productionnull_47283 production = new Productionnull_47283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}