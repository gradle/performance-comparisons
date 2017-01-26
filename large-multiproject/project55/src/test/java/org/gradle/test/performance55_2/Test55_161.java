package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_161 {
    private final Production55_161 production = new Production55_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}