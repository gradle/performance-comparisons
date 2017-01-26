package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_324 {
    private final Production5_324 production = new Production5_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}