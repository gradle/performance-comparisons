package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_141 {
    private final Production49_141 production = new Production49_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}