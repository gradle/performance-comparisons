package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_369 {
    private final Production24_369 production = new Production24_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}