package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6166 {
    private final Productionnull_6166 production = new Productionnull_6166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}