package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_371 {
    private final Production96_371 production = new Production96_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}