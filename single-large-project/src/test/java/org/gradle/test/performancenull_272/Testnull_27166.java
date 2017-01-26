package org.gradle.test.performancenull_272;

import static org.junit.Assert.*;

public class Testnull_27166 {
    private final Productionnull_27166 production = new Productionnull_27166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}