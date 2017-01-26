package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_399 {
    private final Production49_399 production = new Production49_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}