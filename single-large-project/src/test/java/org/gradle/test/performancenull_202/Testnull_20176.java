package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20176 {
    private final Productionnull_20176 production = new Productionnull_20176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}