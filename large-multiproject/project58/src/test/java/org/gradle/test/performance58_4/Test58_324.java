package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_324 {
    private final Production58_324 production = new Production58_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}