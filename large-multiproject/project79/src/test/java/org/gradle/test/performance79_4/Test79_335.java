package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_335 {
    private final Production79_335 production = new Production79_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}