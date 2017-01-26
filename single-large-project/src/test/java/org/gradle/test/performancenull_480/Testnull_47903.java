package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47903 {
    private final Productionnull_47903 production = new Productionnull_47903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}