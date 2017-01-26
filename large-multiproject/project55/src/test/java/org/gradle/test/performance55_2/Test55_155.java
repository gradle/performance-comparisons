package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_155 {
    private final Production55_155 production = new Production55_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}