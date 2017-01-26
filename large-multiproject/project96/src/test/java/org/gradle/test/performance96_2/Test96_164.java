package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_164 {
    private final Production96_164 production = new Production96_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}