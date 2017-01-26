package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_161 {
    private final Production89_161 production = new Production89_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}