package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_362 {
    private final Production80_362 production = new Production80_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}