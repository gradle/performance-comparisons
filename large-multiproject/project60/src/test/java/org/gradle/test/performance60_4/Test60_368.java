package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_368 {
    private final Production60_368 production = new Production60_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}