package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_370 {
    private final Production30_370 production = new Production30_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}