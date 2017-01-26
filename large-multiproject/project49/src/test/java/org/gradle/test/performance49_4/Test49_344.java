package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_344 {
    private final Production49_344 production = new Production49_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}