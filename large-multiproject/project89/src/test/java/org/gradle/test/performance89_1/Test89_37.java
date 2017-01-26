package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_37 {
    private final Production89_37 production = new Production89_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}