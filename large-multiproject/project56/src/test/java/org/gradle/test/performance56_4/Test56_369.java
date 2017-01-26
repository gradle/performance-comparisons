package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_369 {
    private final Production56_369 production = new Production56_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}