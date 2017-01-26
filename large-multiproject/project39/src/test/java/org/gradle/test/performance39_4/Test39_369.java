package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_369 {
    private final Production39_369 production = new Production39_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}