package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25587 {
    private final Productionnull_25587 production = new Productionnull_25587("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}