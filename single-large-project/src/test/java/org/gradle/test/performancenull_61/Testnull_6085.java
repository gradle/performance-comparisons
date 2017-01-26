package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6085 {
    private final Productionnull_6085 production = new Productionnull_6085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}