package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32401 {
    private final Productionnull_32401 production = new Productionnull_32401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}