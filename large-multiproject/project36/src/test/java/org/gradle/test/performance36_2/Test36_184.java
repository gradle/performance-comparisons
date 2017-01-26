package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_184 {
    private final Production36_184 production = new Production36_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}