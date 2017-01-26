package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_236 {
    private final Production29_236 production = new Production29_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}