package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_177 {
    private final Production36_177 production = new Production36_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}