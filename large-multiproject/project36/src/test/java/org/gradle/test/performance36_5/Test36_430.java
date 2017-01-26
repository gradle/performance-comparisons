package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_430 {
    private final Production36_430 production = new Production36_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}