package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_369 {
    private final Production91_369 production = new Production91_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}