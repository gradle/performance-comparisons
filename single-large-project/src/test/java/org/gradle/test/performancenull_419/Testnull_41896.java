package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41896 {
    private final Productionnull_41896 production = new Productionnull_41896("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}