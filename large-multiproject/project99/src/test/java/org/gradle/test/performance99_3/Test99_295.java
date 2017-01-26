package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_295 {
    private final Production99_295 production = new Production99_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}