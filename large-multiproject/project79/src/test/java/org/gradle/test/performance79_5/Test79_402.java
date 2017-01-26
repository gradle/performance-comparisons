package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_402 {
    private final Production79_402 production = new Production79_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}