package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13480 {
    private final Productionnull_13480 production = new Productionnull_13480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}