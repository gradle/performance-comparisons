package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37806 {
    private final Productionnull_37806 production = new Productionnull_37806("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}