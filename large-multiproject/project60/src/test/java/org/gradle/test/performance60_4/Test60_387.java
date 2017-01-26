package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_387 {
    private final Production60_387 production = new Production60_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}