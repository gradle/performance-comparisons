package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_369 {
    private final Production23_369 production = new Production23_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}