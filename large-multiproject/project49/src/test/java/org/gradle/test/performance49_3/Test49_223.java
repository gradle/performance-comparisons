package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_223 {
    private final Production49_223 production = new Production49_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}