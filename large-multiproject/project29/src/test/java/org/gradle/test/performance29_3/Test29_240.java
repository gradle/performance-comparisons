package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_240 {
    private final Production29_240 production = new Production29_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}