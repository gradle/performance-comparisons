package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10221 {
    private final Productionnull_10221 production = new Productionnull_10221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}