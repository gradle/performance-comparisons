package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_387 {
    private final Production42_387 production = new Production42_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}