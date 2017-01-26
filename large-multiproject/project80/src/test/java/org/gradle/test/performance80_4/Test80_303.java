package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_303 {
    private final Production80_303 production = new Production80_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}