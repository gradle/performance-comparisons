package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_463 {
    private final Production49_463 production = new Production49_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}