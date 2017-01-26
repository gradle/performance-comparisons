package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_37 {
    private final Production96_37 production = new Production96_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}