package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_370 {
    private final Production49_370 production = new Production49_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}