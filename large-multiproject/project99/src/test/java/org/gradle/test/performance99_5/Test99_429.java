package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_429 {
    private final Production99_429 production = new Production99_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}