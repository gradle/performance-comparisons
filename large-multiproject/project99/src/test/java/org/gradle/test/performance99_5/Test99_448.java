package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_448 {
    private final Production99_448 production = new Production99_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}