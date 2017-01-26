package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_369 {
    private final Production71_369 production = new Production71_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}