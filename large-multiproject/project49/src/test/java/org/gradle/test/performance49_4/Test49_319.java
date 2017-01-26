package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_319 {
    private final Production49_319 production = new Production49_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}