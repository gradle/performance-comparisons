package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_344 {
    private final Production36_344 production = new Production36_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}