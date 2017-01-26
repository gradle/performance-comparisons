package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49961 {
    private final Productionnull_49961 production = new Productionnull_49961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}