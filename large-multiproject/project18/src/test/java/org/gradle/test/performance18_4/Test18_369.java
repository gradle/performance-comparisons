package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_369 {
    private final Production18_369 production = new Production18_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}