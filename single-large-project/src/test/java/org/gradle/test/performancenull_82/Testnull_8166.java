package org.gradle.test.performancenull_82;

import static org.junit.Assert.*;

public class Testnull_8166 {
    private final Productionnull_8166 production = new Productionnull_8166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}