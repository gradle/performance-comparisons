package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_335 {
    private final Production99_335 production = new Production99_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}