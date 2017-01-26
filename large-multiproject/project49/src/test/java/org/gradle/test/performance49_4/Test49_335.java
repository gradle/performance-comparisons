package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_335 {
    private final Production49_335 production = new Production49_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}