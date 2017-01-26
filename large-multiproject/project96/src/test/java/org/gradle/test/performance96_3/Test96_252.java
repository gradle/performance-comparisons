package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_252 {
    private final Production96_252 production = new Production96_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}