package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_369 {
    private final Production59_369 production = new Production59_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}