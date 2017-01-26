package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_370 {
    private final Production60_370 production = new Production60_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}