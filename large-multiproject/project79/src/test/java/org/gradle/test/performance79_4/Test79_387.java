package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_387 {
    private final Production79_387 production = new Production79_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}