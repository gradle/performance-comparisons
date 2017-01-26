package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_410 {
    private final Production79_410 production = new Production79_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}