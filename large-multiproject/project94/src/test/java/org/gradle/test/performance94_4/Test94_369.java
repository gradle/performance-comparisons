package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_369 {
    private final Production94_369 production = new Production94_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}