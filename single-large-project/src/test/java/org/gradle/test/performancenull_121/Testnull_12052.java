package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12052 {
    private final Productionnull_12052 production = new Productionnull_12052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}