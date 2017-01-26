package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_324 {
    private final Production49_324 production = new Production49_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}