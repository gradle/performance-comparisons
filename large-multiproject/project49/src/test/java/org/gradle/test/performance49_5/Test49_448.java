package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_448 {
    private final Production49_448 production = new Production49_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}