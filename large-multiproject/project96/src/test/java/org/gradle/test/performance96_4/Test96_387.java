package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_387 {
    private final Production96_387 production = new Production96_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}