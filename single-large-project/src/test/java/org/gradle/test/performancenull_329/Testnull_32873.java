package org.gradle.test.performancenull_329;

import static org.junit.Assert.*;

public class Testnull_32873 {
    private final Productionnull_32873 production = new Productionnull_32873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}