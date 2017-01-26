package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40721 {
    private final Productionnull_40721 production = new Productionnull_40721("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}