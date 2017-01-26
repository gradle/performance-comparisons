package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_369 {
    private final Production52_369 production = new Production52_369("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}