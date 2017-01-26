package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_236 {
    private final Production17_236 production = new Production17_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}