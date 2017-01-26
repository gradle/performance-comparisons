package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_382 {
    private final Production80_382 production = new Production80_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}