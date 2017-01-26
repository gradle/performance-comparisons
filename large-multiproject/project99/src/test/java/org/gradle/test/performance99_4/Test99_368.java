package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_368 {
    private final Production99_368 production = new Production99_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}