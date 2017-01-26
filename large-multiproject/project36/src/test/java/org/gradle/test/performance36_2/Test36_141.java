package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_141 {
    private final Production36_141 production = new Production36_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}