package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_369 {
    private final Production72_369 production = new Production72_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}