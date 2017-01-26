package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_6 {
    private final Production96_6 production = new Production96_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}