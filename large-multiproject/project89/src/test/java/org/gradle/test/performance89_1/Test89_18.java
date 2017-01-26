package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_18 {
    private final Production89_18 production = new Production89_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}