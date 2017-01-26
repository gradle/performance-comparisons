package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_236 {
    private final Production99_236 production = new Production99_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}