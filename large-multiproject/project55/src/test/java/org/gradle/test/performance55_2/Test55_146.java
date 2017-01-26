package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_146 {
    private final Production55_146 production = new Production55_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}