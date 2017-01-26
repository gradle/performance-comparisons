package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_391 {
    private final Production49_391 production = new Production49_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}