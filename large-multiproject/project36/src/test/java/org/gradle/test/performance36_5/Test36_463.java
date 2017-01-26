package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_463 {
    private final Production36_463 production = new Production36_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}