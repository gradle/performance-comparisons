package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_117 {
    private final Production36_117 production = new Production36_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}