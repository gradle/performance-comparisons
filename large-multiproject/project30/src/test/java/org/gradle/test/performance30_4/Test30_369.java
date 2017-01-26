package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_369 {
    private final Production30_369 production = new Production30_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}