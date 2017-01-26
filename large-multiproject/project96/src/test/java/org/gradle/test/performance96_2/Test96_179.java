package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_179 {
    private final Production96_179 production = new Production96_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}