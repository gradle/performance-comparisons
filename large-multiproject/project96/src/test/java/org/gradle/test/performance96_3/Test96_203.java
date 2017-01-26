package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_203 {
    private final Production96_203 production = new Production96_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}