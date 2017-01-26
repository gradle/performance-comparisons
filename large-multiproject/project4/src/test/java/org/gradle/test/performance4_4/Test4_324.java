package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_324 {
    private final Production4_324 production = new Production4_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}