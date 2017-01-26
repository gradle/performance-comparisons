package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_369 {
    private final Production22_369 production = new Production22_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}