package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40868 {
    private final Productionnull_40868 production = new Productionnull_40868("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}