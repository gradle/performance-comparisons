package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_359 {
    private final Production99_359 production = new Production99_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}