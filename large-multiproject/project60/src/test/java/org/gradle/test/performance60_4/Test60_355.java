package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_355 {
    private final Production60_355 production = new Production60_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}