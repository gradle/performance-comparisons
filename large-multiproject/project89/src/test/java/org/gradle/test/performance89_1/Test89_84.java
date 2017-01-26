package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_84 {
    private final Production89_84 production = new Production89_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}