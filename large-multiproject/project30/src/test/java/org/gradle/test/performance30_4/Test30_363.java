package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_363 {
    private final Production30_363 production = new Production30_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}