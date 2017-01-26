package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_420 {
    private final Production96_420 production = new Production96_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}