package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_1 {
    private final Production89_1 production = new Production89_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}