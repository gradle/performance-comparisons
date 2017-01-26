package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_394 {
    private final Production36_394 production = new Production36_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}