package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_90 {
    private final Production55_90 production = new Production55_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}