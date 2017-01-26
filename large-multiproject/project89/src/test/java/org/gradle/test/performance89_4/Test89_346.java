package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_346 {
    private final Production89_346 production = new Production89_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}