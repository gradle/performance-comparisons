package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_335 {
    private final Production36_335 production = new Production36_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}