package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_461 {
    private final Production55_461 production = new Production55_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}