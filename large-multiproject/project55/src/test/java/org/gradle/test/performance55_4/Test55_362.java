package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_362 {
    private final Production55_362 production = new Production55_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}