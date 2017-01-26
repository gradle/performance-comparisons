package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_369 {
    private final Production3_369 production = new Production3_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}