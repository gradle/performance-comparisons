package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_278 {
    private final Production36_278 production = new Production36_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}