package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_493 {
    private final Production49_493 production = new Production49_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}