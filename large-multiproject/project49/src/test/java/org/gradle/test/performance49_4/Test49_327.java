package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_327 {
    private final Production49_327 production = new Production49_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}