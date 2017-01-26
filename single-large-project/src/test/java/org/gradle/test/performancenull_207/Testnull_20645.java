package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20645 {
    private final Productionnull_20645 production = new Productionnull_20645("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}