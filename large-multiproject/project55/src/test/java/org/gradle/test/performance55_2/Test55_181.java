package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_181 {
    private final Production55_181 production = new Production55_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}