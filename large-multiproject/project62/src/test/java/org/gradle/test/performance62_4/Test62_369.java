package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_369 {
    private final Production62_369 production = new Production62_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}