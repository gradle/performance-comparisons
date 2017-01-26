package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_295 {
    private final Production5_295 production = new Production5_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}