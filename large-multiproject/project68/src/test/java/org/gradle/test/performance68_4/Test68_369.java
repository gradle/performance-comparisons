package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_369 {
    private final Production68_369 production = new Production68_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}