package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8225 {
    private final Productionnull_8225 production = new Productionnull_8225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}