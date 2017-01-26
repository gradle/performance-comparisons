package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_490 {
    private final Production99_490 production = new Production99_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}