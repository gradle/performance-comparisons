package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42050 {
    private final Productionnull_42050 production = new Productionnull_42050("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}