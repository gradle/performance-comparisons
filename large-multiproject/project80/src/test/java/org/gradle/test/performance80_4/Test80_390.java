package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_390 {
    private final Production80_390 production = new Production80_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}