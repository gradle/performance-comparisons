package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_370 {
    private final Production20_370 production = new Production20_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}