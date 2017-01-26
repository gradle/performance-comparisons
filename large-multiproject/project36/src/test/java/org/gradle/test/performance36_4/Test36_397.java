package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_397 {
    private final Production36_397 production = new Production36_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}