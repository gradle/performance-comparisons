package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_451 {
    private final Production36_451 production = new Production36_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}