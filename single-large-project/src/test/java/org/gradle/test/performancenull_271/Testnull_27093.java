package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27093 {
    private final Productionnull_27093 production = new Productionnull_27093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}