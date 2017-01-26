package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25863 {
    private final Productionnull_25863 production = new Productionnull_25863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}