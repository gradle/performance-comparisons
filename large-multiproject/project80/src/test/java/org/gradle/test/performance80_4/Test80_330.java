package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_330 {
    private final Production80_330 production = new Production80_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}