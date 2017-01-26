package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_369 {
    private final Production34_369 production = new Production34_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}