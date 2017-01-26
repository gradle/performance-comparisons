package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_490 {
    private final Production49_490 production = new Production49_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}