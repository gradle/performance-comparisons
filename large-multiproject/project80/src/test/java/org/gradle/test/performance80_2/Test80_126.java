package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_126 {
    private final Production80_126 production = new Production80_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}