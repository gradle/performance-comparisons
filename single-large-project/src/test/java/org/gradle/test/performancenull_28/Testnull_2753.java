package org.gradle.test.performancenull_28;

import static org.junit.Assert.*;

public class Testnull_2753 {
    private final Productionnull_2753 production = new Productionnull_2753("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}