package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4873 {
    private final Productionnull_4873 production = new Productionnull_4873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}