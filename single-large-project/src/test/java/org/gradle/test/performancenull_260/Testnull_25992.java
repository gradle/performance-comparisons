package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25992 {
    private final Productionnull_25992 production = new Productionnull_25992("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}