package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_122 {
    private final Production89_122 production = new Production89_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}