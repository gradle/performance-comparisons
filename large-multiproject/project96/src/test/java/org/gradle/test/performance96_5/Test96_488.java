package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_488 {
    private final Production96_488 production = new Production96_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}