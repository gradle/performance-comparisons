package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_278 {
    private final Production29_278 production = new Production29_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}