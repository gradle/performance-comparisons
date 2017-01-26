package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_278 {
    private final Production7_278 production = new Production7_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}