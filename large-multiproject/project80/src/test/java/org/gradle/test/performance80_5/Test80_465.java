package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_465 {
    private final Production80_465 production = new Production80_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}