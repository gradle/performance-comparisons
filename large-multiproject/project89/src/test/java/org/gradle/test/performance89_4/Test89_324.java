package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_324 {
    private final Production89_324 production = new Production89_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}