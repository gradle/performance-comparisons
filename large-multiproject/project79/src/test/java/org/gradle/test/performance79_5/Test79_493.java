package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_493 {
    private final Production79_493 production = new Production79_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}