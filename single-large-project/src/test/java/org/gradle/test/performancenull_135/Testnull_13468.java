package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13468 {
    private final Productionnull_13468 production = new Productionnull_13468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}