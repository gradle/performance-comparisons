package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_236 {
    private final Production79_236 production = new Production79_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}