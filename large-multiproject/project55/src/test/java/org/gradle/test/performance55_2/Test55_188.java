package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_188 {
    private final Production55_188 production = new Production55_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}