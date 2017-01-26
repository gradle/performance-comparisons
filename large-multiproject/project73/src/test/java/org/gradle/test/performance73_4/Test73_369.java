package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_369 {
    private final Production73_369 production = new Production73_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}