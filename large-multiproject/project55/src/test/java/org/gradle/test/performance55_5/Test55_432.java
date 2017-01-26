package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_432 {
    private final Production55_432 production = new Production55_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}