package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_466 {
    private final Production55_466 production = new Production55_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}