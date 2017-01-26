package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_467 {
    private final Production89_467 production = new Production89_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}