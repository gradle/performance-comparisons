package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_324 {
    private final Production20_324 production = new Production20_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}