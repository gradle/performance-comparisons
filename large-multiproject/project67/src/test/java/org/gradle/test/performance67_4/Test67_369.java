package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_369 {
    private final Production67_369 production = new Production67_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}