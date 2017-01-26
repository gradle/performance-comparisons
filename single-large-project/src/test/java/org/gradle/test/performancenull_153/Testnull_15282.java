package org.gradle.test.performancenull_153;

import static org.junit.Assert.*;

public class Testnull_15282 {
    private final Productionnull_15282 production = new Productionnull_15282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}