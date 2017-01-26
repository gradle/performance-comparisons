package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_359 {
    private final Production36_359 production = new Production36_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}