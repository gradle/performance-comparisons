package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19154 {
    private final Productionnull_19154 production = new Productionnull_19154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}