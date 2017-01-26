package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_119 {
    private final Production80_119 production = new Production80_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}