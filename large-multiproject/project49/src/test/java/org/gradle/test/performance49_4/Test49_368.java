package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_368 {
    private final Production49_368 production = new Production49_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}