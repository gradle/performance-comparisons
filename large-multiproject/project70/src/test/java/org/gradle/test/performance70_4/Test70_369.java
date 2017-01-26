package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_369 {
    private final Production70_369 production = new Production70_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}