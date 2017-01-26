package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_162 {
    private final Production89_162 production = new Production89_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}