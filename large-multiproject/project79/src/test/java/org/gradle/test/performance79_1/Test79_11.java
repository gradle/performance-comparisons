package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_11 {
    private final Production79_11 production = new Production79_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}