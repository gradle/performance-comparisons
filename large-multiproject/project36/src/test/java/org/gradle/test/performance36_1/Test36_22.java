package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_22 {
    private final Production36_22 production = new Production36_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}