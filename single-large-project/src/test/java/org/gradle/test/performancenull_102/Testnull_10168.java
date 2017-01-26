package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10168 {
    private final Productionnull_10168 production = new Productionnull_10168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}