package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_369 {
    private final Production79_369 production = new Production79_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}