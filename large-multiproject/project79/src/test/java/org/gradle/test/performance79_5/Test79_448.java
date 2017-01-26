package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_448 {
    private final Production79_448 production = new Production79_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}