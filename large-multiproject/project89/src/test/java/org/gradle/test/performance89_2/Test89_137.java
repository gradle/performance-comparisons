package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_137 {
    private final Production89_137 production = new Production89_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}