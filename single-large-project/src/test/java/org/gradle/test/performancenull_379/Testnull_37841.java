package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37841 {
    private final Productionnull_37841 production = new Productionnull_37841("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}