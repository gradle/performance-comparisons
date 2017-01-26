package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_188 {
    private final Production89_188 production = new Production89_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}