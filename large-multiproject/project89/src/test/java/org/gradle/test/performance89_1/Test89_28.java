package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_28 {
    private final Production89_28 production = new Production89_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}