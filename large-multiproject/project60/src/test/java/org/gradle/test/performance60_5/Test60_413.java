package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_413 {
    private final Production60_413 production = new Production60_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}