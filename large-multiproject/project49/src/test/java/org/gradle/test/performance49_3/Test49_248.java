package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_248 {
    private final Production49_248 production = new Production49_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}