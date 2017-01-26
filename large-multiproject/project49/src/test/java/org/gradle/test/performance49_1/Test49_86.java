package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_86 {
    private final Production49_86 production = new Production49_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}