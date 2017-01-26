package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_281 {
    private final Production55_281 production = new Production55_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}