package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_369 {
    private final Production27_369 production = new Production27_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}