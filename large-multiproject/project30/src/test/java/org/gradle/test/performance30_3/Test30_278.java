package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_278 {
    private final Production30_278 production = new Production30_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}