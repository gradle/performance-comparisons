package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_168 {
    private final Production55_168 production = new Production55_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}