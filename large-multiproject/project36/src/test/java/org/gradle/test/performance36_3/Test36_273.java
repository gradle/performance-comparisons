package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_273 {
    private final Production36_273 production = new Production36_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}