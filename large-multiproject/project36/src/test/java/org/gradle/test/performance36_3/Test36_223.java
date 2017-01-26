package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_223 {
    private final Production36_223 production = new Production36_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}