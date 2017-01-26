package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_369 {
    private final Production38_369 production = new Production38_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}