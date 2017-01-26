package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_369 {
    private final Production60_369 production = new Production60_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}