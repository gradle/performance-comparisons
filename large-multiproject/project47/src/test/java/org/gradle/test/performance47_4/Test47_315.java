package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_315 {
    private final Production47_315 production = new Production47_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}