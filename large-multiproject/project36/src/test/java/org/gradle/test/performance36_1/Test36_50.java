package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_50 {
    private final Production36_50 production = new Production36_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}