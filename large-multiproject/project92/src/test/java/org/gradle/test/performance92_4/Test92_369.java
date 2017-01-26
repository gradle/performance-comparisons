package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_369 {
    private final Production92_369 production = new Production92_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}