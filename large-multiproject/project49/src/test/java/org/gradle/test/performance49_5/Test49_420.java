package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_420 {
    private final Production49_420 production = new Production49_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}