package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_197 {
    private final Production49_197 production = new Production49_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}