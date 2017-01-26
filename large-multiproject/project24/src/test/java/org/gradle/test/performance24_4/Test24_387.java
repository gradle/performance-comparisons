package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_387 {
    private final Production24_387 production = new Production24_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}