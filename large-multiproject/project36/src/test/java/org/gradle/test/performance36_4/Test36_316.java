package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_316 {
    private final Production36_316 production = new Production36_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}