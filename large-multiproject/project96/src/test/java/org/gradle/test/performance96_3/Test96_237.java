package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_237 {
    private final Production96_237 production = new Production96_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}