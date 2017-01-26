package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_369 {
    private final Production29_369 production = new Production29_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}