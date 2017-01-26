package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34934 {
    private final Productionnull_34934 production = new Productionnull_34934("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}