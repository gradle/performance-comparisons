package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_429 {
    private final Production49_429 production = new Production49_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}