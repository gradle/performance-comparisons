package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_44 {
    private final Production55_44 production = new Production55_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}