package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_363 {
    private final Production39_363 production = new Production39_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}