package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_433 {
    private final Production36_433 production = new Production36_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}