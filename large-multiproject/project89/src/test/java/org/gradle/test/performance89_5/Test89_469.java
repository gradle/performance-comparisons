package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_469 {
    private final Production89_469 production = new Production89_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}