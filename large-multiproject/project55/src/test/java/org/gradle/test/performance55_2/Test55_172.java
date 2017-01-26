package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_172 {
    private final Production55_172 production = new Production55_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}