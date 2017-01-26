package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_369 {
    private final Production95_369 production = new Production95_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}