package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_369 {
    private final Production55_369 production = new Production55_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}