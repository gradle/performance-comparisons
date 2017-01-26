package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_489 {
    private final Production36_489 production = new Production36_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}