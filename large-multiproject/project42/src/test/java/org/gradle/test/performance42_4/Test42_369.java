package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_369 {
    private final Production42_369 production = new Production42_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}