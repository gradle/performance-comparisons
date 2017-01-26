package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_260 {
    private final Production55_260 production = new Production55_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}