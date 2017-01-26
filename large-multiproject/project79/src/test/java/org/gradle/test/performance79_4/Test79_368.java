package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_368 {
    private final Production79_368 production = new Production79_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}