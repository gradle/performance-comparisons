package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12071 {
    private final Productionnull_12071 production = new Productionnull_12071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}