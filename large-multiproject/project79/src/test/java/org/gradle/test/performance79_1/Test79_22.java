package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_22 {
    private final Production79_22 production = new Production79_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}