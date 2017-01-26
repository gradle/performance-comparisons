package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10225 {
    private final Productionnull_10225 production = new Productionnull_10225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}