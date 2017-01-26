package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_231 {
    private final Production55_231 production = new Production55_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}