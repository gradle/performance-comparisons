package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4790 {
    private final Productionnull_4790 production = new Productionnull_4790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}