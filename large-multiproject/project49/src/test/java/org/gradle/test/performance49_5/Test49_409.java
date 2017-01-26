package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_409 {
    private final Production49_409 production = new Production49_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}