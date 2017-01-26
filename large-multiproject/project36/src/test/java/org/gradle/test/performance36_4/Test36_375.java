package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_375 {
    private final Production36_375 production = new Production36_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}