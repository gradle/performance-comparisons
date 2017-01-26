package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3524 {
    private final Productionnull_3524 production = new Productionnull_3524("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}