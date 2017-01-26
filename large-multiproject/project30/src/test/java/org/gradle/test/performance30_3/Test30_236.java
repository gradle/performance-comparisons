package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_236 {
    private final Production30_236 production = new Production30_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}