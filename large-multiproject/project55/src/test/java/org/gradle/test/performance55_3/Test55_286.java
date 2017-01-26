package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_286 {
    private final Production55_286 production = new Production55_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}