package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_324 {
    private final Production25_324 production = new Production25_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}