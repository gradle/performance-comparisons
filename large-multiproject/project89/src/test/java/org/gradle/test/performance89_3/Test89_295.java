package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_295 {
    private final Production89_295 production = new Production89_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}