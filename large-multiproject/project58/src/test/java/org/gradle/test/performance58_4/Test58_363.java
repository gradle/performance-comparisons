package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_363 {
    private final Production58_363 production = new Production58_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}