package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_369 {
    private final Production97_369 production = new Production97_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}