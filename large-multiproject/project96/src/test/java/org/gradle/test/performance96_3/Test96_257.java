package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_257 {
    private final Production96_257 production = new Production96_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}