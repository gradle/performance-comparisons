package org.gradle.test.performancenull_322;

import static org.junit.Assert.*;

public class Testnull_32183 {
    private final Productionnull_32183 production = new Productionnull_32183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}