package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_332 {
    private final Production49_332 production = new Production49_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}