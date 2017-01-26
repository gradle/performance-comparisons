package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_487 {
    private final Production99_487 production = new Production99_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}