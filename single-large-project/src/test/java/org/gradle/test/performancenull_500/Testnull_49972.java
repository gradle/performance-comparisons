package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49972 {
    private final Productionnull_49972 production = new Productionnull_49972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}