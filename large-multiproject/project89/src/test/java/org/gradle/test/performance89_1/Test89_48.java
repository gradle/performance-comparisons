package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_48 {
    private final Production89_48 production = new Production89_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}