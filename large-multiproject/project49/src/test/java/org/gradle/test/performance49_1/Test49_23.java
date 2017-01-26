package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_23 {
    private final Production49_23 production = new Production49_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}