package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_106 {
    private final Production80_106 production = new Production80_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}