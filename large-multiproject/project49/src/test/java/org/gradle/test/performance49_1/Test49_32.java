package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_32 {
    private final Production49_32 production = new Production49_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}