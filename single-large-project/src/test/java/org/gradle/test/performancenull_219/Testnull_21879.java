package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21879 {
    private final Productionnull_21879 production = new Productionnull_21879("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}