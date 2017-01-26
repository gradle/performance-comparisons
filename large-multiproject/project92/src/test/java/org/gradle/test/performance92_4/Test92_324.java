package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_324 {
    private final Production92_324 production = new Production92_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}