package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_477 {
    private final Production96_477 production = new Production96_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}