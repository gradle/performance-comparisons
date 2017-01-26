package org.gradle.test.performancenull_34;

import static org.junit.Assert.*;

public class Testnull_3360 {
    private final Productionnull_3360 production = new Productionnull_3360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}