package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_236 {
    private final Production90_236 production = new Production90_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}