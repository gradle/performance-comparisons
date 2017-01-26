package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_63 {
    private final Production89_63 production = new Production89_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}