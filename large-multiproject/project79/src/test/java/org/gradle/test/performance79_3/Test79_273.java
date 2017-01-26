package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_273 {
    private final Production79_273 production = new Production79_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}