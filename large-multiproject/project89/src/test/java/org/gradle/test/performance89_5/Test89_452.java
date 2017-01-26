package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_452 {
    private final Production89_452 production = new Production89_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}