package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_369 {
    private final Production14_369 production = new Production14_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}