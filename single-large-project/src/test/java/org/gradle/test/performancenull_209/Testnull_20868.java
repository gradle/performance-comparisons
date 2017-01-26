package org.gradle.test.performancenull_209;

import static org.junit.Assert.*;

public class Testnull_20868 {
    private final Productionnull_20868 production = new Productionnull_20868("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}