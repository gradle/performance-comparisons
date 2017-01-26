package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_453 {
    private final Production36_453 production = new Production36_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}