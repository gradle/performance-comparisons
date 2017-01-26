package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_50 {
    private final Production49_50 production = new Production49_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}