package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_459 {
    private final Production49_459 production = new Production49_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}