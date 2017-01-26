package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_302 {
    private final Production89_302 production = new Production89_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}