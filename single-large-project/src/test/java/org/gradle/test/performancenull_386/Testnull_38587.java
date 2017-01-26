package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38587 {
    private final Productionnull_38587 production = new Productionnull_38587("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}