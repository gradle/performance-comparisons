package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_236 {
    private final Production49_236 production = new Production49_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}