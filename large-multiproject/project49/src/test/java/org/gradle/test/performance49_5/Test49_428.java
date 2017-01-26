package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_428 {
    private final Production49_428 production = new Production49_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}