package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_324 {
    private final Production7_324 production = new Production7_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}