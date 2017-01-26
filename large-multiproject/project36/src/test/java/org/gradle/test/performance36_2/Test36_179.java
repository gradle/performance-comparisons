package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_179 {
    private final Production36_179 production = new Production36_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}