package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_248 {
    private final Production36_248 production = new Production36_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}