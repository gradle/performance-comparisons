package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38563 {
    private final Productionnull_38563 production = new Productionnull_38563("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}