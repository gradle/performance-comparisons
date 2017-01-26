package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_394 {
    private final Production96_394 production = new Production96_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}