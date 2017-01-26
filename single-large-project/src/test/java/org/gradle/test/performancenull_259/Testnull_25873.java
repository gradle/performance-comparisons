package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25873 {
    private final Productionnull_25873 production = new Productionnull_25873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}