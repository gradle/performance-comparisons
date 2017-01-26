package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_8 {
    private final Production89_8 production = new Production89_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}