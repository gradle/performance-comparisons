package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_181 {
    private final Production96_181 production = new Production96_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}