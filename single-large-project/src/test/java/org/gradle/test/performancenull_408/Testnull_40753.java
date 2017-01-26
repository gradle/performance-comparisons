package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40753 {
    private final Productionnull_40753 production = new Productionnull_40753("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}