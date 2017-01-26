package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38593 {
    private final Productionnull_38593 production = new Productionnull_38593("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}