package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_355 {
    private final Production49_355 production = new Production49_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}