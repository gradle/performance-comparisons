package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_369 {
    private final Production17_369 production = new Production17_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}