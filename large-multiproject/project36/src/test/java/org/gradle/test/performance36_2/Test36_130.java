package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_130 {
    private final Production36_130 production = new Production36_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}