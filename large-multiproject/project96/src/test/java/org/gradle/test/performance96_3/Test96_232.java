package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_232 {
    private final Production96_232 production = new Production96_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}