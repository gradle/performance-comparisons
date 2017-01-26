package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48390 {
    private final Productionnull_48390 production = new Productionnull_48390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}