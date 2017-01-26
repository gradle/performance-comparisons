package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40331 {
    private final Productionnull_40331 production = new Productionnull_40331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}