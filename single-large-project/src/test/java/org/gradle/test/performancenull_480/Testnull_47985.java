package org.gradle.test.performancenull_480;

import static org.junit.Assert.*;

public class Testnull_47985 {
    private final Productionnull_47985 production = new Productionnull_47985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}