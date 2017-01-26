package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_369 {
    private final Production10_369 production = new Production10_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}