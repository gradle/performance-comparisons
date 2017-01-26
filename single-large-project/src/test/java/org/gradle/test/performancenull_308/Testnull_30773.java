package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30773 {
    private final Productionnull_30773 production = new Productionnull_30773("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}