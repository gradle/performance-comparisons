package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_101 {
    private final Production36_101 production = new Production36_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}