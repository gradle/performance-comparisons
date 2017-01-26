package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_143 {
    private final Production89_143 production = new Production89_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}