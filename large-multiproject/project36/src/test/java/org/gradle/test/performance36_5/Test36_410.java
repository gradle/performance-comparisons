package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_410 {
    private final Production36_410 production = new Production36_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}