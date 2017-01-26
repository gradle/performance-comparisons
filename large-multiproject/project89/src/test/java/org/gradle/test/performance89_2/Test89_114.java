package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_114 {
    private final Production89_114 production = new Production89_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}