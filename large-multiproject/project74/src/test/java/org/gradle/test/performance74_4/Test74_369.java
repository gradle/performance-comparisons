package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_369 {
    private final Production74_369 production = new Production74_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}