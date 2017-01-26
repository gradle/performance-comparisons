package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1868 {
    private final Productionnull_1868 production = new Productionnull_1868("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}