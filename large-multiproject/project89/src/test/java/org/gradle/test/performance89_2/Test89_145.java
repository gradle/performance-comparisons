package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_145 {
    private final Production89_145 production = new Production89_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}