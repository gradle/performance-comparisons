package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_236 {
    private final Production18_236 production = new Production18_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}