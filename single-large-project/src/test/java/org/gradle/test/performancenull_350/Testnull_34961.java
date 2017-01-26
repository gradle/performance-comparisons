package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34961 {
    private final Productionnull_34961 production = new Productionnull_34961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}