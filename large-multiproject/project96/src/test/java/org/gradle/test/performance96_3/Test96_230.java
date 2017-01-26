package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_230 {
    private final Production96_230 production = new Production96_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}