package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_369 {
    private final Production90_369 production = new Production90_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}