package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_363 {
    private final Production43_363 production = new Production43_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}