package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_443 {
    private final Production79_443 production = new Production79_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}