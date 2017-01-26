package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_308 {
    private final Production49_308 production = new Production49_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}