package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_369 {
    private final Production50_369 production = new Production50_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}