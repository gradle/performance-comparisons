package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_316 {
    private final Production49_316 production = new Production49_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}