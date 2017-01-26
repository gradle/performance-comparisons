package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_298 {
    private final Production49_298 production = new Production49_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}