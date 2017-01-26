package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_284 {
    private final Production49_284 production = new Production49_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}