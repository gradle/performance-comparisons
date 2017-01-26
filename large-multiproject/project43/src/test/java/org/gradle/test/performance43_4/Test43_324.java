package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_324 {
    private final Production43_324 production = new Production43_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}