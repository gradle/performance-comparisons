package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_493 {
    private final Production36_493 production = new Production36_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}