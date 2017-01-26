package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_236 {
    private final Production74_236 production = new Production74_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}