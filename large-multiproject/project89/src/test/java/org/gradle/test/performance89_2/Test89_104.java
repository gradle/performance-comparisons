package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_104 {
    private final Production89_104 production = new Production89_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}