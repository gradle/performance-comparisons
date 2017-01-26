package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_299 {
    private final Production99_299 production = new Production99_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}