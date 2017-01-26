package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_99 {
    private final Production89_99 production = new Production89_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}