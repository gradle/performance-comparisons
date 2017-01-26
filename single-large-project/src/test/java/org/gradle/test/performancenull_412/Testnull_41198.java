package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41198 {
    private final Productionnull_41198 production = new Productionnull_41198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}