package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_320 {
    private final Production80_320 production = new Production80_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}