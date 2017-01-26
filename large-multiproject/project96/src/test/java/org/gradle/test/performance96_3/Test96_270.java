package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_270 {
    private final Production96_270 production = new Production96_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}