package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_493 {
    private final Production99_493 production = new Production99_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}