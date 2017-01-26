package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_376 {
    private final Production49_376 production = new Production49_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}