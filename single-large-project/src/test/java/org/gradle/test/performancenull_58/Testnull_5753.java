package org.gradle.test.performancenull_58;

import static org.junit.Assert.*;

public class Testnull_5753 {
    private final Productionnull_5753 production = new Productionnull_5753("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}