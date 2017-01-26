package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_369 {
    private final Production12_369 production = new Production12_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}