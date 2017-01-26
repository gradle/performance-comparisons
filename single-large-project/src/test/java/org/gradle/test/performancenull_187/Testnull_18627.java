package org.gradle.test.performancenull_187;

import static org.junit.Assert.*;

public class Testnull_18627 {
    private final Productionnull_18627 production = new Productionnull_18627("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}