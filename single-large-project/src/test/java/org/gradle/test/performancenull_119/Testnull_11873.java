package org.gradle.test.performancenull_119;

import static org.junit.Assert.*;

public class Testnull_11873 {
    private final Productionnull_11873 production = new Productionnull_11873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}