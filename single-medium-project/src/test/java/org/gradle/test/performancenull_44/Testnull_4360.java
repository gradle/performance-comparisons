package org.gradle.test.performancenull_44;

import static org.junit.Assert.*;

public class Testnull_4360 {
    private final Productionnull_4360 production = new Productionnull_4360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}