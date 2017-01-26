package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_295 {
    private final Production92_295 production = new Production92_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}