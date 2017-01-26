package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_236 {
    private final Production43_236 production = new Production43_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}