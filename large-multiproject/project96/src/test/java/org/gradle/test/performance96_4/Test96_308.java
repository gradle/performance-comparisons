package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_308 {
    private final Production96_308 production = new Production96_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}