package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_153 {
    private final Production36_153 production = new Production36_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}