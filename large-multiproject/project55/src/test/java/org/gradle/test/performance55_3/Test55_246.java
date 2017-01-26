package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_246 {
    private final Production55_246 production = new Production55_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}