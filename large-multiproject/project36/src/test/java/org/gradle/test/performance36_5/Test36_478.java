package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_478 {
    private final Production36_478 production = new Production36_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}