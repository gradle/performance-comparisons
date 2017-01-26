package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_465 {
    private final Production55_465 production = new Production55_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}