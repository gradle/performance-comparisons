package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_245 {
    private final Production36_245 production = new Production36_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}