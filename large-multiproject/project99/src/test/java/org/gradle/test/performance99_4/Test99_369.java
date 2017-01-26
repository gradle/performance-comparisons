package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_369 {
    private final Production99_369 production = new Production99_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}