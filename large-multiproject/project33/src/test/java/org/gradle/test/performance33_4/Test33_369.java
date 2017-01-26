package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_369 {
    private final Production33_369 production = new Production33_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}