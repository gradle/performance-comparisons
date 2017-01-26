package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_236 {
    private final Production1_236 production = new Production1_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}