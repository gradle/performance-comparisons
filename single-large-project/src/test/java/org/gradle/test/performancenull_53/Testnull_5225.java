package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5225 {
    private final Productionnull_5225 production = new Productionnull_5225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}