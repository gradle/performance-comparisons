package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_154 {
    private final Production55_154 production = new Production55_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}