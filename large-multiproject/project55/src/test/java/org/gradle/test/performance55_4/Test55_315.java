package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_315 {
    private final Production55_315 production = new Production55_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}