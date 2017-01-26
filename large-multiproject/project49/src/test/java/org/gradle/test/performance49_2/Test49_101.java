package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_101 {
    private final Production49_101 production = new Production49_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}