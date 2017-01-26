package org.gradle.test.performancenull_88;

import static org.junit.Assert.*;

public class Testnull_8753 {
    private final Productionnull_8753 production = new Productionnull_8753("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}