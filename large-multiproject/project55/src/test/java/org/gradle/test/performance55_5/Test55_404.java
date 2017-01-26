package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_404 {
    private final Production55_404 production = new Production55_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}