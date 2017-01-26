package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_369 {
    private final Production19_369 production = new Production19_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}