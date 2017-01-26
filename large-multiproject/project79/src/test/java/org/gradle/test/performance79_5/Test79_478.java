package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_478 {
    private final Production79_478 production = new Production79_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}