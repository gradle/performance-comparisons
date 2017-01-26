package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40898 {
    private final Productionnull_40898 production = new Productionnull_40898("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}