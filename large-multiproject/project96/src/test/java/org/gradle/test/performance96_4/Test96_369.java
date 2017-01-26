package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_369 {
    private final Production96_369 production = new Production96_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}