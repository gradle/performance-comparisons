package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_425 {
    private final Production48_425 production = new Production48_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}