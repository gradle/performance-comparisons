package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_369 {
    private final Production57_369 production = new Production57_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}