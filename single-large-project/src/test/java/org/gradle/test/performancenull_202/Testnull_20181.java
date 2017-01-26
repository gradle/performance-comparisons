package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20181 {
    private final Productionnull_20181 production = new Productionnull_20181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}