package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_338 {
    private final Production55_338 production = new Production55_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}