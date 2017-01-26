package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37041 {
    private final Productionnull_37041 production = new Productionnull_37041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}