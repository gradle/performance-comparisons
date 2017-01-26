package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_369 {
    private final Production89_369 production = new Production89_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}