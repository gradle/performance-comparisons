package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34976 {
    private final Productionnull_34976 production = new Productionnull_34976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}