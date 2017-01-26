package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1753 {
    private final Productionnull_1753 production = new Productionnull_1753("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}