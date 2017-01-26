package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25841 {
    private final Productionnull_25841 production = new Productionnull_25841("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}