package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_363 {
    private final Production90_363 production = new Production90_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}