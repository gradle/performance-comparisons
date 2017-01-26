package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_330 {
    private final Production55_330 production = new Production55_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}