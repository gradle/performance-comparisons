package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_249 {
    private final Production89_249 production = new Production89_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}