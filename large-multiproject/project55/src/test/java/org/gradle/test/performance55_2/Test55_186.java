package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_186 {
    private final Production55_186 production = new Production55_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}