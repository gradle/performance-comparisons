package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_363 {
    private final Production7_363 production = new Production7_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}