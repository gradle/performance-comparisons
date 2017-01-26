package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_23 {
    private final Production96_23 production = new Production96_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}