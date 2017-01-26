package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_363 {
    private final Production60_363 production = new Production60_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}