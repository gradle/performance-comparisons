package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_152 {
    private final Production89_152 production = new Production89_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}