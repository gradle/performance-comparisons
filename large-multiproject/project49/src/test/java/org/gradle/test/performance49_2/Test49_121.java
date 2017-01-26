package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_121 {
    private final Production49_121 production = new Production49_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}