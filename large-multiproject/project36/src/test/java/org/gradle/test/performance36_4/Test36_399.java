package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_399 {
    private final Production36_399 production = new Production36_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}