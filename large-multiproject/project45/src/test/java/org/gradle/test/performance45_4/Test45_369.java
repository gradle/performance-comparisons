package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_369 {
    private final Production45_369 production = new Production45_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}