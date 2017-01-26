package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40339 {
    private final Productionnull_40339 production = new Productionnull_40339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}