package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_315 {
    private final Production84_315 production = new Production84_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}