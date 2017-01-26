package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21303 {
    private final Productionnull_21303 production = new Productionnull_21303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}