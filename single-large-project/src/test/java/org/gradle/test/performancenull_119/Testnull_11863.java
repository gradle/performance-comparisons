package org.gradle.test.performancenull_119;

import static org.junit.Assert.*;

public class Testnull_11863 {
    private final Productionnull_11863 production = new Productionnull_11863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}