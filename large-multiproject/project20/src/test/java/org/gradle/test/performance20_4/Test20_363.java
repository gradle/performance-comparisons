package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_363 {
    private final Production20_363 production = new Production20_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}