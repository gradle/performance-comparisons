package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_429 {
    private final Production36_429 production = new Production36_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}