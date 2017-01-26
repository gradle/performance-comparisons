package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_101 {
    private final Production79_101 production = new Production79_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}