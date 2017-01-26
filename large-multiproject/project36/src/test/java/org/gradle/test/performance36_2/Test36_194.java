package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_194 {
    private final Production36_194 production = new Production36_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}