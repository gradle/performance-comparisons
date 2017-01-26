package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_193 {
    private final Production96_193 production = new Production96_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}