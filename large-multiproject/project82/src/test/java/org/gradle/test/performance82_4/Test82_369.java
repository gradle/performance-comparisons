package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_369 {
    private final Production82_369 production = new Production82_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}