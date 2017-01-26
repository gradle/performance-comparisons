package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11927 {
    private final Productionnull_11927 production = new Productionnull_11927("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}