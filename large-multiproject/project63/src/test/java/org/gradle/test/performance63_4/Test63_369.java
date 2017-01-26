package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_369 {
    private final Production63_369 production = new Production63_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}