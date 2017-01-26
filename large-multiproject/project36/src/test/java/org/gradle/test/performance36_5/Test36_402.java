package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_402 {
    private final Production36_402 production = new Production36_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}