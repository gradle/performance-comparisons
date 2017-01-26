package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_343 {
    private final Production96_343 production = new Production96_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}