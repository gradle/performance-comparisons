package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_466 {
    private final Production80_466 production = new Production80_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}