package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_305 {
    private final Production55_305 production = new Production55_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}