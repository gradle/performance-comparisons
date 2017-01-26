package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_305 {
    private final Production80_305 production = new Production80_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}