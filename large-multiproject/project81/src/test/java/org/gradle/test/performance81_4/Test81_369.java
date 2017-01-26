package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_369 {
    private final Production81_369 production = new Production81_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}