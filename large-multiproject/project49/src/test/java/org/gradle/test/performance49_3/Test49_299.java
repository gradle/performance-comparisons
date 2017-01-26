package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_299 {
    private final Production49_299 production = new Production49_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}