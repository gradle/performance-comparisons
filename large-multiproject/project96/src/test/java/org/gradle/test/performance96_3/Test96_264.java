package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_264 {
    private final Production96_264 production = new Production96_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}