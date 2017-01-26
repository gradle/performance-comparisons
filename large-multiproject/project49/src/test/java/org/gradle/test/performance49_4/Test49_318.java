package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_318 {
    private final Production49_318 production = new Production49_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}