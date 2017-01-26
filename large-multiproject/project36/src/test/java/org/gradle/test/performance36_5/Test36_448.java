package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_448 {
    private final Production36_448 production = new Production36_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}