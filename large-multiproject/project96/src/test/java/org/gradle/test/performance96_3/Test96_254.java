package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_254 {
    private final Production96_254 production = new Production96_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}