package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_192 {
    private final Production96_192 production = new Production96_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}