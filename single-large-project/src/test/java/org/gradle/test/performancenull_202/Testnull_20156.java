package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20156 {
    private final Productionnull_20156 production = new Productionnull_20156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}