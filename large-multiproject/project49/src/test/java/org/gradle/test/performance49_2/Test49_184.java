package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_184 {
    private final Production49_184 production = new Production49_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}