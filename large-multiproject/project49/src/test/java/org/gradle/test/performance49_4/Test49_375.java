package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_375 {
    private final Production49_375 production = new Production49_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}