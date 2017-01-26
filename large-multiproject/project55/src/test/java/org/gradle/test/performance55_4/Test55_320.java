package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_320 {
    private final Production55_320 production = new Production55_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}