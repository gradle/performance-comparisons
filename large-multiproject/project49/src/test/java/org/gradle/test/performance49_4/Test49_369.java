package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_369 {
    private final Production49_369 production = new Production49_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}