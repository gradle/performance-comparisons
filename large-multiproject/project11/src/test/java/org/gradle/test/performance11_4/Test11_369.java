package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_369 {
    private final Production11_369 production = new Production11_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}