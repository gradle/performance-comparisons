package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_396 {
    private final Production96_396 production = new Production96_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}