package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_301 {
    private final Production36_301 production = new Production36_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}