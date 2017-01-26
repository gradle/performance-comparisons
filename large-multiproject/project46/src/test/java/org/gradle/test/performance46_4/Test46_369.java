package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_369 {
    private final Production46_369 production = new Production46_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}