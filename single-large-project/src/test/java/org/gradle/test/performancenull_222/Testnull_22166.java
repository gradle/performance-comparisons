package org.gradle.test.performancenull_222;

import static org.junit.Assert.*;

public class Testnull_22166 {
    private final Productionnull_22166 production = new Productionnull_22166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}