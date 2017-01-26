package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_153 {
    private final Production49_153 production = new Production49_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}