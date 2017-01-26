package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_262 {
    private final Production36_262 production = new Production36_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}