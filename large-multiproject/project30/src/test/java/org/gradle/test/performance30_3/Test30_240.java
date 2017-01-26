package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_240 {
    private final Production30_240 production = new Production30_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}