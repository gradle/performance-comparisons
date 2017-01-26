package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_355 {
    private final Production99_355 production = new Production99_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}