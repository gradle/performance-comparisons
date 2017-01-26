package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_25 {
    private final Production89_25 production = new Production89_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}