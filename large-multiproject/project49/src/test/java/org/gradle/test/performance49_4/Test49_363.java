package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_363 {
    private final Production49_363 production = new Production49_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}