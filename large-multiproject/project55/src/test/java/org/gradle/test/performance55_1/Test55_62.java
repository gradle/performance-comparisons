package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_62 {
    private final Production55_62 production = new Production55_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}