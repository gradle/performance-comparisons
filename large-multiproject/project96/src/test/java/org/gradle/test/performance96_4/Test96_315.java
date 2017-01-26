package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_315 {
    private final Production96_315 production = new Production96_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}