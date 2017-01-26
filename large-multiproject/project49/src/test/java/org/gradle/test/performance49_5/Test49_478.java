package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_478 {
    private final Production49_478 production = new Production49_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}