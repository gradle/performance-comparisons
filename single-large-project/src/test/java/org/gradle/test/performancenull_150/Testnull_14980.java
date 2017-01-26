package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14980 {
    private final Productionnull_14980 production = new Productionnull_14980("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}