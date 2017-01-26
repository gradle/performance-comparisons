package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_369 {
    private final Production1_369 production = new Production1_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}