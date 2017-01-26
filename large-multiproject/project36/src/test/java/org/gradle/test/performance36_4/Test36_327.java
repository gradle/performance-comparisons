package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_327 {
    private final Production36_327 production = new Production36_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}