package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_121 {
    private final Production36_121 production = new Production36_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}