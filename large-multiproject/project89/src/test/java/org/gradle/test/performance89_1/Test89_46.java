package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_46 {
    private final Production89_46 production = new Production89_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}