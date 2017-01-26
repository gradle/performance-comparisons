package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_369 {
    private final Production51_369 production = new Production51_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}