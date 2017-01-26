package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_6 {
    private final Production89_6 production = new Production89_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}