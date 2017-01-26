package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_363 {
    private final Production25_363 production = new Production25_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}