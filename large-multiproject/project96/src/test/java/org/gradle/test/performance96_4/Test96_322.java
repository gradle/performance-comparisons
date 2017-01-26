package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_322 {
    private final Production96_322 production = new Production96_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}