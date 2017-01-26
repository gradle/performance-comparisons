package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25843 {
    private final Productionnull_25843 production = new Productionnull_25843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}