package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_369 {
    private final Production85_369 production = new Production85_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}