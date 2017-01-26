package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40225 {
    private final Productionnull_40225 production = new Productionnull_40225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}