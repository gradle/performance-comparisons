package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_369 {
    private final Production87_369 production = new Production87_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}