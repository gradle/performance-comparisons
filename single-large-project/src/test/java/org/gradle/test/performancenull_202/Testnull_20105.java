package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20105 {
    private final Productionnull_20105 production = new Productionnull_20105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}