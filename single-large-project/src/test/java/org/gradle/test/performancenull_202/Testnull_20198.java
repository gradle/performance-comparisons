package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20198 {
    private final Productionnull_20198 production = new Productionnull_20198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}