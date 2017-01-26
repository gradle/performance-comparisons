package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_295 {
    private final Production20_295 production = new Production20_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}